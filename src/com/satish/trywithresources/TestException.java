package com.satish.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class TestException {

	public static void main(String[] args) {
		test();	
	}
	
	private static void test()
	{
		try(FileReader fr = new FileReader("sdf");
		       )
		{
			System.out.println("Dsfd");
			String s = null;
			s.length();
		}
		catch(IOException|NullPointerException e)
		{
			e.printStackTrace();
			System.out.println(new Throwable().getSuppressed());
			
		} 
		catch(Throwable t)
		{
			throw t;
		}
		finally
		{
			
		}
	}
}
