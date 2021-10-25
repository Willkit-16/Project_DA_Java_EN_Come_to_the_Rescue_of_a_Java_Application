package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounterV2 {
	public static void main(String args[]) throws Exception {

		ISymptomReader readFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> lines = readFile.getSymptoms();

		System.out.println(lines);
	}
}
