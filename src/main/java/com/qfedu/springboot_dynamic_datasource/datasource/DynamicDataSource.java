package com.qfedu.springboot_dynamic_datasource.datasource;/*
 *@ClassName:DynamicDataSource
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:55
 */

import lombok.Data;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSelector.threadLocal.get();
    }

    @Data
    public static class DataSourceSelector {
        public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    }

}
