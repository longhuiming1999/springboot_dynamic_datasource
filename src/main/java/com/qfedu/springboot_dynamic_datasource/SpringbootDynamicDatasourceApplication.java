package com.qfedu.springboot_dynamic_datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.qfedu.springboot_dynamic_datasource.mapper")
public class SpringbootDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDynamicDatasourceApplication.class, args);
    }

}
