package com.training.assignment.six;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class Q3_AnnotationReaderUtil {

	public static void readAnnotation(AnnotatedElement element) {

		Annotation[] annotations = element.getAnnotations();

		if (annotations.length == 0) {
			System.out.println("No annotations present.");
			return;
		}

		for (Annotation annotation : annotations) {

			if (annotation instanceof Q2_Author) {
				Q2_Author author = (Q2_Author) annotation;
				System.out.println("Author: " + author.name());
			}

			if (annotation instanceof Q2_Version) {
				Q2_Version version = (Q2_Version) annotation;
				System.out.println("Version: " + version.number());
			}
		}
	}
}
