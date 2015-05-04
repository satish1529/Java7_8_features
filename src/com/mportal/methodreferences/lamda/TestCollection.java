package com.mportal.methodreferences.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollection {

	public static void main(String[] args) {
		testList();
	}
	
	private static void testList()
	{
		Person p1 = new Person(1,100,"test1","M");
		Person p2 = new Person(2,100,"test2","M");
		Person p3 = new Person(3,300,"test3","F");
		Person p4 = new Person(4,400,"test4","F");
		Person p5 = new Person(5,500,"test5","M");
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		long sum = list.stream().filter(p -> p.getSalary()>200).mapToLong(p -> p.getSalary()).sum();
		System.out.println(sum);
		
		sum = list.stream().filter(p -> p.getSalary()>200).mapToLong(PersonHelper::getSalaryStatic).mapToInt(PersonHelper::convertToInt).sum();
		
		sum = list.stream().filter(p -> p.getSalary()>200).mapToLong(PersonHelper::getSalaryStatic).sum();
		System.out.println(sum);
		
		PersonHelper ph = new PersonHelper();
		sum = list.stream().filter(p -> p.getSalary()>200).mapToLong(ph::getSalary).sum();
		System.out.println(sum);
		
		list.stream().forEach(p -> System.out.println(p.getName()));
		
		list.stream().forEach(ph::printName);
		
		Map<String,Map<Long,List<Person>>> map = list.stream().collect(Collectors.groupingBy(PersonHelper::getGenderStatic,Collectors.groupingBy(PersonHelper::getSalaryStatic)));
		System.out.println(map);
		
		
	}
}
