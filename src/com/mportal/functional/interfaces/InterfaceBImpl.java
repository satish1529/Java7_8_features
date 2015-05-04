package com.mportal.functional.interfaces;

public class InterfaceBImpl extends ClassB implements InterfaceB,InterfaceC {

	@Override
	public void testAbstract() {
		// TODO Auto-generated method stub
		System.out.println("abstract InterfaceBImpl");
		testDefaultIntefaceA();
		testStaticInterfaceA();
InterfaceB.super.testDefaultIntefaceA();
InterfaceC.super.testDefaultIntefaceA();
		super.testDefaultIntefaceA();
	}

	static void testStaticInterfaceA()
	{
		
		System.out.println("InterfaceBImpl testStaticInterfaceB");
	}
	
	/*public  void testDefaultIntefaceA()
	{
		System.out.println("default InterfaceBImpl");
		
		InterfaceB.super.testDefaultIntefaceA();
		
		super.testDefaultIntefaceA();
		//return null;
	}*/
	
	
	
}
