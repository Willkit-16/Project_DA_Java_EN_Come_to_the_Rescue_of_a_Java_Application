package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Use TreeMap to write a new list of sorted symptoms.
 * 
 */
public interface ISymptomWriter {

	/**
	 * This method is used to return a list of symptoms and occurrences in String
	 * from a Treemap
	 * 
	 * @param sortedSymptoms Treemap with symptoms (key) and number of occurrences
	 *                       (values)
	 * 
	 * 
	 * @return a list of sorted symptoms with number of occurrences
	 * 
	 */
	List<String> finalSymptoms(TreeMap<String, Long> sortedSymptoms);
}
