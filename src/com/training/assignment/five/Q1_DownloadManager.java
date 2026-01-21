package com.training.assignment.five;

public class Q1_DownloadManager {
	public static void main(String[] args) {

		String[] fileUrls = new String[25];

		for (int i = 0; i < 25; i++) {
			fileUrls[i] = "https://www.dropbox.com/photo" + (i + 1) + ".jpg";  //creating fake urls
		}

		for (int i = 0; i < fileUrls.length; i++) {    

			Q1_FileDownloader downloader = new Q1_FileDownloader(fileUrls[i]);

			Thread t = new Thread(downloader, "Downloader-" + (i + 1));

			t.start();
		}
	}
}
