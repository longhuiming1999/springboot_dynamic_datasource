package com.qfedu.springboot_dynamic_datasource.datasource;/*
 *@ClassName:DbConfig
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:26
 */

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.qfedu.springboot_dynamic_datasource.entity.Db1DataSource;
import com.qfedu.springboot_dynamic_datasource.entity.Db2DataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DbConfig {

    @Value("${mybatis-plus.mapper-locations}")
    private String mapperLocation;

    @Autowired
    private Db1DataSource db1DataSource;

    @Autowired
    private Db2DataSource db2DataSource;

    @Bean
    public DataSource getDataSource() {

        DynamicDataSource dynamicDataSource = new DynamicDataSource();

        dynamicDataSource.setDefaultTargetDataSource(db1DataSource.getDataSource());

        Map<Object, Object> map = new HashMap<>();
        map.put("db1", db1DataSource.getDataSource());
        map.put("db2", db2DataSource.getDataSource());

        dynamicDataSource.setTargetDataSources(map);

        return dynamicDataSource;
    }


    @Bean
    public SqlSessionFactory getSqlSessionFactory(DataSource getDataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(mapperLocation);

        sqlSessionFactoryBean.setDataSource(getDataSource);

        sqlSessionFactoryBean.setMapperLocations(resources);

        try {
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }


}
