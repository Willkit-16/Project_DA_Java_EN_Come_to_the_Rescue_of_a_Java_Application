package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Use TreeMap to write a new list of sorted symptoms.
 * 
 */

public interface ISymptomWriter {

	/**
	 * If no data is available, this will create an empty file
	 * 
	 * @return a list of sorted symptoms with their keys and values.
	 *
	 */
	List<String> finalSymptoms(TreeMap<String, Long> sortedSymptoms);
}
