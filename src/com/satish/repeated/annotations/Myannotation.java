/**
 * 
 */
package com.satish.repeated.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author satish.k
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
@Repeatable(Myannotations.class)
public @interface Myannotation {

	String name() ;
	String role() default "admin";
	
}
