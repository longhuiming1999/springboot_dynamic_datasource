package com.qfedu.springboot_dynamic_datasource.mapper;/*
 *@InterfaceName:StudentMapper
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:13
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.springboot_dynamic_datasource.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> queryAll();
}
