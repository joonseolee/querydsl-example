//package com.joonseolee.querydslexample.config;
//
//import lombok.RequiredArgsConstructor;
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.support.TransactionTemplate;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@RequiredArgsConstructor
//@EnableJpaRepositories(
//        basePackages = "com.joonseolee.querydslexample",
//        entityManagerFactoryRef = "entityManagerFactory",
//        transactionManagerRef = "jpaTransactionManager"
//)
//@Configuration
//public class DataSourceConfiguration {
//    private static final String PACKAGE_DIRECTORY = "com.joonseolee.querydslexample";
//
//    private final Properties jpaCommonPropertiesConfiguration;
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("org.h2.Driver")
//                .url("jdbc:h2:mem://localhost/~/testdb;MODE=MYSQL")
//                .username("sa")
//                .password("")
//                .build();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        var entityFactory = new LocalContainerEntityManagerFactoryBean();
//        entityFactory.setDataSource(dataSource);
//        entityFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        entityFactory.setPackagesToScan(PACKAGE_DIRECTORY);
//        entityFactory.setJpaProperties(jpaCommonPropertiesConfiguration);
//        return entityFactory;
//    }
//
//    @Bean
//    public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
//        var mainJpaTransactionManager = new JpaTransactionManager();
//        mainJpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
//        return mainJpaTransactionManager;
//    }
//
//    @Bean
//    public TransactionTemplate transactionTemplate(PlatformTransactionManager jpaTransactionManager) {
//        return new TransactionTemplate(jpaTransactionManager);
//    }
//}
