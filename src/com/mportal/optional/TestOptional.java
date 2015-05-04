package com.mportal.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	private static void test()
	{
		Optional<String> o = Optional.ofNullable(get());
		//System.out.println(Optional.empty().get());
		System.out.println(o.isPresent());
		o.orElseGet(TestOptional::supply);
		o.ifPresent(TestOptional::consume);
		
	}
	
	
	private static String get()
	{
		return "sfd";
	}
	
	private static void consume(String s)
	{
		System.out.println("value present");
	}
	
	private static String supply()
	{
		System.out.println("got it");
		return "got it";
	}
}
