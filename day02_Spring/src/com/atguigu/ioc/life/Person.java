package com.atguigu.ioc.life;

public class Person {
	
	private Integer id;
	private String gender;
	private String name;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("2. Dependency injection");
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		System.out.println("4. Using it");
		return "Person [id=" + id + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
	
	public Person() {
		System.out.println("1. Creating the bean");
		// TODO Auto-generated constructor stub
	}
	
	
	public void init() {
		System.out.println("3. Instantiation");
	}
	
	
	public void destroy() {
		System.out.println("5. Destroy");
	}
	
}
