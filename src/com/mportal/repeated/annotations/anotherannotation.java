/**
 * 
 */
package com.mportal.repeated.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Enumeration;



/**
 * @author satish.k
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface anotherannotation  {

	String name() ;
	int values() default 0;
	String [] sa() default {"1"};
	double d() default 10.0;
	long t() default 10;
	char c() default 1;
	Conversions value() default Conversions.test;
}
