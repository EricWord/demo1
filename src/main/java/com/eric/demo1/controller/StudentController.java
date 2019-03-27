package com.eric.demo1.controller;/*
 *@description:
 *@author:cuigs
 *@Email:cuigs@ti-net.com.cn
 *@Version:1.0
 *@Date:2019/3/27
 */

import com.eric.demo1.bean.Student;
import com.eric.demo1.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentMapper.selectStudentById(id);

    }
}
