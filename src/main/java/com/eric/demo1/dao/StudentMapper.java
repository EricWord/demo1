package com.eric.demo1.dao;/*
 *@description:学生mapper
 *@author:cuigs
 *@Email:cuigs@ti-net.com.cn
 *@Version:1.0
 *@Date:2019/3/27
 */

import com.eric.demo1.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    /**
     * 查询
     * @param id 学生id
     * @return 返回学生对象
     */
    @Select("select * from tb_student where id=#{id}")
    public Student selectStudentById(int id);


}
