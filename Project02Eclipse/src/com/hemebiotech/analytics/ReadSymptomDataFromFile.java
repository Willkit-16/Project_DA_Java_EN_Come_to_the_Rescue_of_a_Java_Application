package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */

	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable
	 * @throws IOException
	 */

	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		BufferedReader reader = null;

		if (filepath != null) {
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}

			} catch (IOException e) {

				System.out.println("Erreur lors de la lecture du fichier");
			} finally {
				reader.close();
			}
		}

		return result;
	}

}
