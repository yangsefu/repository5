package com.clive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.Student;
import com.clive.mapper.StudentMapper;
import com.clive.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> findStudentAll() {
		List<Student> list = studentMapper.findStudentAll();
		return list;
	}
	@Override
	public Student findStudentById(Integer id) {
		Student s = studentMapper.findStudentById(id);
		return s;
	}
	@Override
	public List<Student> findLikeByUserName(String username) {
		List<Student> list = studentMapper.findLikeByUserName(username);
		return list;
	}
	@Override
	public List<Student> findStudentBySearch(Student s) {
		List<Student> list = studentMapper.findStudentBySearch(s);
		return list;
	}
	@Override
	public void addStudent(Student s) {
		int count = studentMapper.addStudent(s);
		System.out.println(count);
	}
	@Override
	public void updateStudent(Student s) {
		int count = studentMapper.updateStudent(s);
		System.out.println(count);
		
	}
	@Override
	public void deleteStudent(Integer id) {
		int count = studentMapper.deleteStudent(id);
		System.out.println(count);
	}
//	根据选中的id删除
//	ids 选中集合
	@Override
	public void deleteStduentSelect(List<Integer> ids) {
         int count = studentMapper.deleteStduentSelect(ids);
		
	}

}
