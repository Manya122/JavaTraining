package com.training.assignment.four;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_MaxDoubleFinder {

	public static void main(String[] args) {

		String filePath = "resources/data.txt";
		List<Double> values = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			while ((line = br.readLine()) != null) {

				line = line.trim();

				if (line.isEmpty()) {
					continue;
				}

				try {
					double value = Double.parseDouble(line);
					values.add(value);
				} catch (NumberFormatException e) {
					System.out.println("Invalid number skipped: " + line);
				}
			}

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
			return;
		}

		if (values.isEmpty()) {
			System.out.println("No valid double values found.");
			return;
		}

		double max = Collections.max(values);
		System.out.println("Largest value: " + max);
	}
}
