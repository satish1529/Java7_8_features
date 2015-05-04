package com.mportal.functional.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInterfaces();
	}

	private static void testInterfaces()
	{
		InterfaceA a = new InterfaceAImpl();
		a.testDefaultIntefaceA();
		a.testAbstract();
		InterfaceA.testStaticInterfaceA();
		
		InterfaceB b = new InterfaceBImpl();
		b.testDefaultIntefaceA();
		
		InterfaceB.testStaticInterfaceA();
		InterfaceBImpl.testStaticInterfaceA();
	}
}
