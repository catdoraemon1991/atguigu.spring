package com.atguigu.spring.di;

import java.util.List;
import java.util.Map;

public class Teacher {

	private Integer tid;
	private String name;
	private List<String> cls;
	private List<Student> students;
	private Map<String, String> bossMap;
	
	public Map<String, String> getBossMap() {
		return bossMap;
	}
	public void setBossMap(Map<String, String> bossMap) {
		this.bossMap = bossMap;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<String> getCls() {
		return cls;
	}
	public void setCls(List<String> cls) {
		this.cls = cls;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", cls=" + cls + ", students=" + students + ", bossMap="
				+ bossMap + "]";
	}
	
	
}
