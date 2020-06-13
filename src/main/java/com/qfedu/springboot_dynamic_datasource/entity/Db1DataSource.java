package com.qfedu.springboot_dynamic_datasource.entity;/*
 *@ClassName:Db1DataSource
 *@Author:lg
 *@Description:
 *@Date:2020/6/1322:11
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.db1")
public class Db1DataSource extends BaseDataSource {
}
