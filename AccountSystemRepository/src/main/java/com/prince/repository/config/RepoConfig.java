package com.prince.repository.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.prince.domain.persistence")
@EnableJpaRepositories(basePackages = "com.prince.repository.repos")
@PropertySource(value = "classpath:applicationdb.properties")
public class RepoConfig {
   /* private static final String[] ENTITY_PACKAGES_TO_SCAN = {"za.ac.nwu.AccountSystem.domain.persistence"};

    @Bean
    public DataSource datasource(){
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();

        return builder.setType(EmbeddedDatabaseType.HSQL)
                .addScripts("script/schema.sql")
                .addScript("script/data.sql")
                .build();

    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagestoScan(ENTITY_PACKAGES_TO_SCAN);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setJpaProperties(buildJpaProperties());
        entityManagerFactoryBean.setPersistenceUnitManager(PERSISTENCE_UNIT_NAME);
        
        return entityManagerFactoryBean;
    }
    
    public PlatformTransactionManager transactionManager(entityManagerFactory entityManagerFactory){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }*/
    
}
