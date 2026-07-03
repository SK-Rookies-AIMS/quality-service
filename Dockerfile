FROM eclipse-temurin:17-jdk-jammy AS builder

WORKDIR /workspace

COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle settings.gradle ./

RUN sed -i 's/\r$//' gradlew && chmod +x gradlew

COPY src src

RUN ./gradlew clean bootJar -x test --no-daemon

RUN JAR_FILE=$(find build/libs -maxdepth 1 -type f -name '*.jar' ! -name '*-plain.jar' | head -n 1) && test -n "$JAR_FILE" && cp "$JAR_FILE" build/libs/app.jar


FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

RUN groupadd --system --gid 10001 spring && useradd --system --uid 10001 --gid 10001 --home-dir /app --shell /usr/sbin/nologin spring

COPY --from=builder /workspace/build/libs/app.jar /app/app.jar

RUN chown -R 10001:10001 /app

USER 10001:10001

EXPOSE 8083

ENTRYPOINT ["java","-XX:MaxRAMPercentage=75.0","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]