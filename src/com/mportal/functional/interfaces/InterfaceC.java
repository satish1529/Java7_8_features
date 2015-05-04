package com.mportal.functional.interfaces;

public interface InterfaceC {

	String interfaceA="sfds";
	
	void testAbstract();
	
	default void testDefaultIntefaceA()
	{
		System.out.println("testDefaultIntefaceC");
		//return null;
		
	}
	
	static void testStaticInterfaceA()
	{
		System.out.println("testStaticInterfaceC");
	}
	
	
}
