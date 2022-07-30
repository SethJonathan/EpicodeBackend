package it.epicode.catalogo;

import java.util.HashMap;
import java.util.Map;
//service che viene usato per mettere i dati iniziali del catalogo relativi a libri e riviste
//inoltre questa classe pubblica viene usata dall'utente per interagire con il catalogo
public class Service {
	
	public Map<String, Catalogo> mainCatalog = new HashMap<>();
	
	//informazioni sui libri e sulle riviste
	Catalogo libro1 = new Libro("0019307651923", "Narnia", "2012", 963, "C.S.Lewis", "Fantasy");
	Catalogo libro2 = new Libro("0781591063049", "Tarzan", "2018", 763, "Edgar Rice Burroughs", "Avventura");
	Catalogo libro3 = new Libro("9589130042967", "Hunger Games", "2020", 523, "Suzanne Collins", "Drammatico");
	Catalogo libro4 = new Libro("6527993300140", "I Pirati della malesia", "2010", 876, "Emilio Salgari", "Avventura");
	Catalogo libro5 = new Libro("9378031095470", "Il Signore degli Anelli", "2022", 126, "J.R.R.Tolkien", "Fantasy");
	Catalogo rivista1 = new Rivista("1565474321892", "Focus", "2020", 23, Periodicita.MENSILE);
	Catalogo rivista2 = new Rivista("2721778576876", "Jack", "2019", 43, Periodicita.SETTIMANALE);
	Catalogo rivista3 = new Rivista("4378673184381", "Domus", "2012", 51, Periodicita.SEMESTRALE);
	Catalogo rivista4 = new Rivista("9327887976631", "Altroconsumo", "2018", 22, Periodicita.MENSILE);
	Catalogo rivista5 = new Rivista("4327898436482", "Donna Moderna", "2022", 63, Periodicita.SETTIMANALE);
	//aggiunta libro o rivista
	public void addElement(Catalogo element) {
		mainCatalog.put(element.getISBNcode(), element);
	}
	//rimozione libro o rivista(sia per l'aggiunta che per la rimozione identifichiamo l'lelemento preciso grazie al codice ISBN)
	public void deleteElement(Catalogo element) {
		mainCatalog.remove(element.getISBNcode());
	}

	public Service() {
		super();
	}
	//"popolo" la lista con i libri e le riviste iniziali
	public Map<String, Catalogo> popolaLista(){
		
	
		//aggiungo ogni singolo elemento
		addElement(libro1);
		addElement(libro2);
		addElement(libro3);
		addElement(libro4);
		addElement(libro5);
		addElement(rivista1);
		addElement(rivista2);
		addElement(rivista3);
		addElement(rivista4);
		addElement(rivista5);
		//ottenfo il catalogo in return come risultato
		return mainCatalog;
	};
	
	
	

}
