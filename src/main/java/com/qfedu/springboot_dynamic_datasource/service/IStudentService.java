package com.qfedu.springboot_dynamic_datasource.service;/*
 *@InterfaceName:IStudentService
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:10
 */

import com.qfedu.springboot_dynamic_datasource.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> queryAll();
}
