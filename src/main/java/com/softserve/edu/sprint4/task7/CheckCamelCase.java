package com.softserve.edu.sprint4.task7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

class ClassForAnnot {
	@CamelCase
	public static void example() {
	}

	@CamelCase
	public void Example() {
	}

	public static void _main(String args[]) {
	}
}

class Class1 {
	@CamelCase
	public void correct() {
	}

	@CamelCase
	public void InCorrect() {
	}

	@CamelCase
	public void JustMethod() {
	}
}

class Class2 {
	@CamelCase
	public void correct() {
	}

	@CamelCase
	public void oneMoreCorrect() {
	}
}

public class CheckCamelCase {

	// constants CAMELCASE_PATTERN and ERROR_MESSAGE_TEMPLATE

	// checkAndPrint(...) method
	public static final String CAMELCASE_PATTERN = "^[a-z]+[a-zA-Z0-9]*$";

	public static boolean checkAndPrint(Class<?> clazz) {
		int count = 0;
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : clazz.getDeclaredMethods()) {
			if (method.isAnnotationPresent(CamelCase.class)) {
				if (method.getName().matches(CAMELCASE_PATTERN)) {
					count++;
				} else {
					System.out.println("method " + clazz.getSimpleName() + "." + method.getName() + " doesn't satisfy camelCase naming convention");
				}
			}
		}
		return count == declaredMethods.length;
	}
}
