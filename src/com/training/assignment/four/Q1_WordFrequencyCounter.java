package com.training.assignment.four;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q1_WordFrequencyCounter {

	public static void main(String[] args) {

		String filePath = "resources/story.txt";
		Map<String, Integer> wordCountMap = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			while ((line = br.readLine()) != null) {

				line = line.trim();

				if (line.isEmpty()) {
					continue;
				}

				line = line.toLowerCase().replaceAll("[^a-z ]", "");

				String[] words = line.split("\\s+");

				for (String word : words) {

					if (word.isEmpty()) {
						continue;
					}

					wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
				}
			}

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
			return;
		}

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
		}
	}
}
