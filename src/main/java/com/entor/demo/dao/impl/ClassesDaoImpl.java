package com.entor.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.entor.demo.dao.ClassesDao;
import com.entor.demo.entity.Classes;

@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
