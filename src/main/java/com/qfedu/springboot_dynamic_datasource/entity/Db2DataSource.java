package com.qfedu.springboot_dynamic_datasource.entity;/*
 *@ClassName:Db2DataSource
 *@Author:lg
 *@Description:
 *@Date:2020/6/1322:12
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.db2")
public class Db2DataSource extends BaseDataSource {
}
