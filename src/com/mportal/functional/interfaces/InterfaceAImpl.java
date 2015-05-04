package com.mportal.functional.interfaces;

public class InterfaceAImpl implements InterfaceB {

	@Override
	public void testAbstract() {
		// TODO Auto-generated method stub
		System.out.println("abstract InterfaceAImpl");
		testStaticInterfaceA();
		testDefaultIntefaceA();
	}

	static void testStaticInterfaceA()
	{
		System.out.println("InterfaceAImpl testStaticInterfaceA");
	}
	
}
