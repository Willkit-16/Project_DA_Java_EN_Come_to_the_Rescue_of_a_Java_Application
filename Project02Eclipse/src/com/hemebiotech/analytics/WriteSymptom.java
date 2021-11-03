package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptom implements ISymptomWriter {
	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */

	public WriteSymptom(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @param sortedSymptoms Treemap with symptoms (key) and number of occurrences
	 *                       (values)
	 * 
	 * 
	 * @return a list of sorted symptoms with number of occurrences
	 * @throws IOException
	 * 
	 */

	@Override
	public List<String> finalSymptoms(TreeMap<String, Long> sortedSymptoms) throws IOException {
		List<String> res = new ArrayList<>();
		FileWriter writer = null;
		try {
			if (this.filepath != null) {
				writer = new FileWriter(filepath);

				for (Entry<String, Long> entry : sortedSymptoms.entrySet()) {
					String key = entry.getKey();
					Long value = entry.getValue();

					String keyAndValue = key + " : " + value.toString();

					res.add(keyAndValue);
					writer.write(keyAndValue + "\n");
				}

			}
		}

		catch (IOException e) {

			System.out.println("Erreur lors de l'écriture du fichier");
		} finally {
			writer.close();
		}

		return res;

	}
}
