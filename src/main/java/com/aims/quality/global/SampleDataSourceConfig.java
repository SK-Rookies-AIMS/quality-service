package com.aims.quality.global;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.aims.quality.sample_db.repository",
        entityManagerFactoryRef = "sampleEntityManagerFactory",
        transactionManagerRef = "sampleTransactionManager"
)
public class SampleDataSourceConfig {

    @Bean
    @ConfigurationProperties("app.datasource.sample")
    public DataSourceProperties sampleDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource sampleDataSource() {
        return sampleDataSourceProperties()
                .initializeDataSourceBuilder()
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean sampleEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {

        return builder
                .dataSource(sampleDataSource())
                .packages("com.aims.quality.sample_db.entity")
                .persistenceUnit("sample")
                .build();
    }

    @Bean
    public PlatformTransactionManager sampleTransactionManager(
            @Qualifier("sampleEntityManagerFactory")
            EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}