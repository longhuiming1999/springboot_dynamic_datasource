package com.qfedu.springboot_dynamic_datasource.controller;/*
 *@ClassName:TestController
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:05
 */

import com.qfedu.springboot_dynamic_datasource.datasource.DynamicDataSource;
import com.qfedu.springboot_dynamic_datasource.entity.Student;
import com.qfedu.springboot_dynamic_datasource.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/all/{type}")
    public List<Student> all(@PathVariable("type") int type) {

        if (type == 1) {
            DynamicDataSource.DataSourceSelector.threadLocal.set("db1");
        } else {
            DynamicDataSource.DataSourceSelector.threadLocal.set("db2");
        }

        return studentService.queryAll();
    }
}
