package com.mportal.methodreferences.lamda;

public class Person {
	
	int age;
	
	long salary;
	
	String name;
	
	String gender;

	Person(int age,int salary,String name,String gender)
	{
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
	}
	
	public String toString()
	{
		return this.name+","+this.age+","+this.gender+","+this.salary;
	}
	

	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public static long getSalaries(Person p) {
		return p.salary;
	}

	
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
