package com.qfedu.springboot_dynamic_datasource.entity;/*
 *@ClassName:BaseDataSource
 *@Author:lg
 *@Description:
 *@Date:2020/6/1322:09
 */

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Data
public class BaseDataSource {
    private String url;
    private String driver;
    private String username;
    private String password;

    public DataSource getDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}
