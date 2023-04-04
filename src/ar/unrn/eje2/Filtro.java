package ar.unrn.eje2;

import java.util.ArrayList;
import java.util.List;

public class Filtro {

	public Filtro() {
	}

	public static List<String[]> filtrar(Lamda<String> lamda, List<String[]> csvData) {
		List<String[]> csvDataFinal = new ArrayList<String[]>();
		for (int i = 0; i < csvData.size(); i++) {
			if (lamda.ejecutar(csvData.get(i))) {
				csvDataFinal.add(csvData.get(i));
			}
		}
		return csvDataFinal;
	}

}
