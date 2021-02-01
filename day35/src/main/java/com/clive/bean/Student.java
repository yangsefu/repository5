package com.clive.bean;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.druid.pool.DruidDataSource;

public class Student implements Serializable{
	private int id;
	private String username;
	private Integer age;
	private Double score;
	private Date created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", age=" + age + ", score=" + score + ", created="
				+ created + "]";
	}
	
}
