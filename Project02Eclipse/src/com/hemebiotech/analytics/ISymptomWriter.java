package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * Use TreeMap to write a new list of sorted symptoms.
 * 
 */
public interface ISymptomWriter {

	/**
	 * @param sortedSymptoms Treemap with symptoms (key) and number of occurrences
	 *                       (values)
	 * 
	 * 
	 * @return a list of sorted symptoms with number of occurrences
	 * @throws IOException
	 * 
	 */
	List<String> finalSymptoms(TreeMap<String, Long> sortedSymptoms) throws IOException;
}
