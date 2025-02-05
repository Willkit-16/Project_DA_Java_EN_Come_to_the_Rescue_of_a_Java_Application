package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounterV2 {
	public static void main(String args[]) throws Exception {

		ISymptomReader readFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> lines = readFile.getSymptoms();

		ISymptomCounter countFile = new CountSymptom();
		TreeMap<String, Long> mapSymptom = countFile.init(lines);

		ISymptomWriter writeFile = new WriteSymptom("Project02Eclipse/result.out");
		List<String> result = writeFile.finalSymptoms(mapSymptom);

		System.out.println(result);
	}
}