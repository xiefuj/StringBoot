package com.entor.demo.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.demo.entity.Student;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student s = new Student();
		s.setId(1);
		s.setName("张三");
		s.setUsername("zhangsan");
		s.setPassword("123");
		s.setSex(1);
		s.setAge(20);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));
		return s;
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
