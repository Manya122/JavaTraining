package com.training.assignment.five;

import java.util.Random;

public class Q1_FileDownloader implements Runnable {

	private String fileUrl;

	public Q1_FileDownloader(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public void run() {

		String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);

		System.out.println(Thread.currentThread().getName() + " - Starting download: " + fileName);

		// Simulate download time (200–500 ms)
		Random random = new Random();
		int sleepTime = 200 + random.nextInt(301);

		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			System.out.println("Download interrupted: " + fileName);
		}

		System.out.println(Thread.currentThread().getName() + " - Completed: " + fileName);
	}
}
