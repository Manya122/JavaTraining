package com.training.assignment.three;

import java.io.*;

public class Q2_BufferComparison {

	static File source = new File("resources/sample.png");

	//NON BUFFERED BYTE
	static long nonBuffered() throws IOException {

		File dest = new File("resources/nonBuffered.jpg");

		long start = System.currentTimeMillis();

		try (FileInputStream fis = new FileInputStream(source); 
				FileOutputStream fos = new FileOutputStream(dest)) {

			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	//BUFFERED byte
	static long buffered() throws IOException {

		File dest = new File("resources/buffered.jpg");

		long start = System.currentTimeMillis();

		try (BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(dest))) {

			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {

		try {

			long t1 = nonBuffered();
			long t2 = buffered();

			System.out.println("Without Buffering: " + t1 + " ms");
			System.out.println("With Buffering   : " + t2 + " ms");
			System.out.println("Performance improved by: " + (t1 - t2) + " ms");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
