package com.qfedu.springboot_dynamic_datasource.service.impl;/*
 *@ClassName:StudentServiceImpl
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:12
 */

import com.qfedu.springboot_dynamic_datasource.entity.Student;
import com.qfedu.springboot_dynamic_datasource.mapper.StudentMapper;
import com.qfedu.springboot_dynamic_datasource.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public List<Student> queryAll() {
        return mapper.queryAll();
    }
}
