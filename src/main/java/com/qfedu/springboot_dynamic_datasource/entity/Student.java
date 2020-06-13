package com.qfedu.springboot_dynamic_datasource.entity;/*
 *@ClassName:Student
 *@Author:lg
 *@Description:
 *@Date:2020/6/1321:10
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
public class Student {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;

}
