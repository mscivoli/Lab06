package it.polito.tdp.meteo;

import java.util.*;

import it.polito.tdp.meteo.bean.Citta;
import it.polito.tdp.meteo.bean.SimpleCity;
import it.polito.tdp.meteo.db.MeteoDAO;

public class Model {
	
	List<Citta> intero;

	private final static int COST = 100;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;

	public Model() {
		
		MeteoDAO dao = new MeteoDAO();
		

	}

	public String getUmiditaMedia(int mese) {

		return "TODO!";
	}

	public String trovaSequenza(int mese) {
		

		return "TODO!";
	}
	
	
	public void cercaSoluzione() {
		
		List<Citta> parziale = new LinkedList<Citta>();
		
		cerca();
	}
	
	
	private void cerca() {

		
		
		
	}
	
	
	
	

	private Double punteggioSoluzione(List<SimpleCity> soluzioneCandidata) {

		double score = 0.0;
		return score;
	}

	private boolean controllaParziale(List<SimpleCity> parziale) {

		return true;
	}

}
