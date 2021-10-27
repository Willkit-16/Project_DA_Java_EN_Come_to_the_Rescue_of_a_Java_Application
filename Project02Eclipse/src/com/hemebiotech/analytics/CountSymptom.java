package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptom implements ISymptomCounter {

	@Override
	public TreeMap<String, Long> init(List<String> symptomsText) {

		TreeMap<String, Long> sortedSymptoms = new TreeMap<>();
		for (String line : symptomsText)

			if (sortedSymptoms.containsKey(line)) {
				// if map contains line, increment line +1
				sortedSymptoms.put(line, sortedSymptoms.get(line) + 1);
			}

			else {
				// or initialization to 1 for new line
				sortedSymptoms.put(line, 1L);
			}

		return sortedSymptoms;

	}
}