package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class CSV {

	private CSVReader reader;

	public CSV() throws IOException {
		this.reader = new CSVReader(new FileReader("data.csv"));
	}

	public List<String[]> csvData() throws IOException {

		List<String[]> csvData = new ArrayList<String[]>();
		String[]       row     = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();

		return csvData;

	}

	public List<String[]> addKey(List<String[]> csvData, Map<String, String> options) {

		if (options.containsKey("company_name")) { // Si existe la llave "company name"...

			Lamda<String> lamda = (String[] s) -> s[1].equals(options.get("company_name"));
			csvData = Filtro.filtrar(lamda, csvData);

//			List<String[]> results = new ArrayList<String[]>();
//
//			for (int i = 0; i < csvData.size(); i++) {
//				if (csvData.get(i)[1].equals(options.get("company_name"))) {
//					results.add(csvData.get(i));
//				}
//			}
//			csvData = results;
		}

		if (options.containsKey("city")) {
			List<String[]> results = new ArrayList<String[]>();

			for (int i = 0; i < csvData.size(); i++) {
				if (csvData.get(i)[4].equals(options.get("city"))) {
					results.add(csvData.get(i));
				}
			}
			csvData = results;
		}

		if (options.containsKey("state")) {
			List<String[]> results = new ArrayList<String[]>();

			for (int i = 0; i < csvData.size(); i++) {
				if (csvData.get(i)[5].equals(options.get("state"))) {
					results.add(csvData.get(i));
				}
			}
			csvData = results;
		}

		if (options.containsKey("round")) {
			List<String[]> results = new ArrayList<String[]>();

			for (int i = 0; i < csvData.size(); i++) {
				if (csvData.get(i)[9].equals(options.get("round"))) {
					results.add(csvData.get(i));
				}
			}
			csvData = results;
		}

		return csvData;

	}
}
