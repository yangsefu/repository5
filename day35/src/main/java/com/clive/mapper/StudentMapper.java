package com.clive.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.clive.bean.Student;

//这个接口没有实现类 不用加入注解加载到spring里
/**
 * mybatis映射文件规则：
 * 1.mybatis的映射文件想要生效必须要映射文件的名称等于接口的类名
 * 2.映射文件不一定放在接口里 具体要看spring的配置文件写的那个位置
 * 3.mybatis映射文件里面有一个属性namespace一定要写接口的全类名
 *
 */
public interface StudentMapper {
//	注解模式
//	@Select("SELECT * FROM student")
      List<Student> findStudentAll();

	
//	@Select("")
	List<Student> findStudentBySearch(Student s);



	Student findStudentById(Integer id);



	int addStudent(Student s);



	int updateStudent(Student s);



	int deleteStudent(Integer id);



	List<Student> findLikeByUserName(String username);



	int deleteStduentSelect(@Param("ids")List<Integer> ids);











	
}
