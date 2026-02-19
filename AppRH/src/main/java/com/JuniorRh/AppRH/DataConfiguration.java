package com.JuniorRh.AppRH;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/AppRh?useTimezone=true$setTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("155487");
        return dataSource;
    }


}
