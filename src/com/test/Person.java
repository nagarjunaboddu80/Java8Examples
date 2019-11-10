package com.test;

import java.math.BigDecimal;

public class Person {
	
	String name;
	int id;
	double salary;
	String comments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", salary=" + salary + ", comments=" + comments + "]";
	}
	public Person(String name, int id, double d, String comments) {
		super();
		this.name = name;
		this.id = id;
		this.salary = d;
		this.comments = comments;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
