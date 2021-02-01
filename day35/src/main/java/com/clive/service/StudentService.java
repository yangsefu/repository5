package com.clive.service;

import java.util.List;

import com.clive.bean.Student;

public interface StudentService {
	//    查询全体
	List<Student> findStudentAll();
	//   通过id查
	Student findStudentById(Integer id);
	//     添加
	void addStudent(Student s);
	//	  修改
	void updateStudent(Student s);
	//	删除
	void deleteStudent(Integer id);


    /**
     * 
     * @param username 需要查询的用户信息
     * @return  根据用户名模糊查询用户信息
     */
	List<Student> findLikeByUserName(String username);
	/**
	 * 
	 * @param s 需要查询的学生条件 可以是多个 也可以没有
	 * @return 多条件查询学生信息
	 */ 
	List<Student> findStudentBySearch(Student s);
	void deleteStduentSelect(List<Integer> ids);
}
