package com.lyx.multipledatasource.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import javax.sql.DataSource;

/**
 * @ClassName DataSourceConfig
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-06 19:57
 * @Version 1.0
 */
@Configuration
public class DataSourceConfig {
    //配置第一个数据源
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix="test1.datasource")
    public DataSource primaryDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
    @Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("primaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    //配置第二个数据源
    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    //@Primary
    @ConfigurationProperties(prefix="test2.datasource")
    public DataSource secondaryDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(
            @Qualifier("secondaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
