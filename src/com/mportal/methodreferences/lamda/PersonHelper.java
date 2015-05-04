package com.mportal.methodreferences.lamda;

public class PersonHelper {
	
	
	public long getSalary(Person p) {
		return p.salary;
	}

	public static long getSalaryStatic(Person p) {
		return p.salary;
	}
	
	public static String getGenderStatic(Person p) {
		return p.gender;
	}

	public static int convertToInt(long p) {
		return (int) p;
	}
		
	public static void printStaticName(Person p) {
		System.out.println(p.getName());
	}
	
	public  void printName(Person p) {
		System.out.println(p.getName());
	}
	

}
