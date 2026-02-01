package com.training.assignment.six;

import java.lang.reflect.Method;

public class Q3_AnnotationReflectionTest {

	public static void main(String[] args) {

		Class<Q2_AnnotatedClass> clazz = Q2_AnnotatedClass.class;

		System.out.println("Class: " + clazz.getSimpleName());
		Q3_AnnotationReaderUtil.readAnnotation(clazz);

		Method[] methods = clazz.getDeclaredMethods();

		for (Method method : methods) {

			System.out.println("\nMethod: " + method.getName());
			Q3_AnnotationReaderUtil.readAnnotation(method);
		}
	}
}
