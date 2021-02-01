package com.clive.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clive.bean.Student;
import com.clive.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentController {
	@Autowired
	private StudentService service;
	@Test
	public void demo1() {
		List<Student> list = service.findStudentAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void demo2() {
		Student student = service.findStudentById(14);
		System.out.println(student);
	}
	@Test
	public void demo3() {
		Student s =new Student();
		s.setUsername("阿尔黛西亚");
		s.setAge(26);
		s.setScore(88d);
		Date date = new Date();
		s.setCreated(date);
		service.addStudent(s);
	}
	@Test
	public void demo4() {
		Student s =new Student();
		s.setId(17);
		s.setUsername("李雷");
		s.setAge(17);
		s.setScore(20d);
		Date date = new Date();
		s.setCreated(date);
		service.updateStudent(s);
	}
	@Test
	public void demo5() {
		service.deleteStudent(16);
	}
	@Test
	public void demo6() {
		List<Student> list = service.findLikeByUserName("李");
		for (Student student : list) {
			System.out.println(student);
		}
		
	} 
	@Test
	public void demo7() {
		Student s = new Student();
		s.setUsername("李雷");
		s.setAge(17);
//		s.setScore(90d);
		List<Student> list = service.findStudentBySearch(s);
        for (Student student : list) {
			System.out.println(student);
		}   
	}
	@Test
	public void demo8() {
	
		List<Integer> ids = new ArrayList<Integer>();
	    ids.add(1);
	    ids.add(2); 
	    ids.add(14);
	    service.deleteStduentSelect(ids);
	}
	
}
