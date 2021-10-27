package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * Count symptoms from list, and sorted by name.
 * 
 */
public interface ISymptomCounter {

	/**
	 * If no data is available, this will create an empty map
	 * 
	 * @return a raw map of all Symptoms counted and sorted from Symptom's List
	 */
	TreeMap<String, Long> init(List<String> symptomsText);
}
