package com.satish.repeated.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.sun.istack.internal.NotNull;

public class Test {
    
	@Myannotation(name = "satish",role="test")
	@Myannotation(name = "satish1",role="test1")
    String str1;
	
	@anotherannotation(name = "testing")
	String str;
	
	@NotNull String test;
	
	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		System.out.println(t.test);
	}

	private void test()
	{
		Test t = new Test();
		Field field =  null;
		Annotation [] annotaitons = null;
		try {
		
			field = t . getClass().getDeclaredField("str1");
			System.out.println(field.getName());
			Myannotations m = field.getAnnotation(Myannotations.class);
			System.out.println(field.isAnnotationPresent(Myannotations.class));
			annotaitons = field.getAnnotations();
			System.out.println(annotaitons.length);
			for(Annotation annotation :annotaitons )
			{
				Myannotations mya = (Myannotations)annotation;
				Myannotation [] myannos = mya.value();
				System.out.println(myannos.length);
				for(Myannotation myanno : myannos)
				{
					System.out.println("name :"+myanno.name()+ ",  role : "+myanno.role());
				}
			}
		} catch (NoSuchFieldException | SecurityException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
