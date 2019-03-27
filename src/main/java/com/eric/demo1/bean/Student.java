package com.eric.demo1.bean;
/*
 *@description: 学生实体类
 *@author:cuigs
 *@Email:cuigs@ti-net.com.cn
 *@Version:1.0
 *@Date:2019/3/27
 */

import java.io.Serializable;

public class Student implements Serializable {
    //id
    private Integer id;
    //学生姓名
    private String name;
    //课程名称代码
    private String subject;

    public Student() {
    }

    public Student(Integer id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

