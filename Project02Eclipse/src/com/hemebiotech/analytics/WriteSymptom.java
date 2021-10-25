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
	 * @param create file with list of sorted symptoms, one symptom per line with
	 *               key and value
	 *
	 */

	public List<String> finalSymptoms(TreeMap<String, Long> sortedSymptoms) {
		List<String> res = new ArrayList<>();

		try {
			if (this.filepath != null) {
				FileWriter writer = new FileWriter(filepath);

				for (Entry<String, Long> entry : sortedSymptoms.entrySet()) {
					String key = entry.getKey();
					Long value = entry.getValue();

					String keyAndValue = key + " : " + value.toString();

					res.add(keyAndValue);
					writer.write(keyAndValue + "\n");
				}
				writer.close();
			}
		}

		catch (IOException e) {

			System.out.println("Erreur lors de l'écriture du fichier");
		}

		return res;

	}
}
