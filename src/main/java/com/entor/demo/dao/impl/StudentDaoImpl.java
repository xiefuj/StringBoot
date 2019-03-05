package com.entor.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.entor.demo.dao.StudentDao;
import com.entor.demo.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

}
