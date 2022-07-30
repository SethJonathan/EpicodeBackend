package it.epicode.catalogo;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchClass implements Search {

	public Map<String, Catalogo> mainCatalog;

	public SearchClass(Map<String, Catalogo> mainCatalog) {

		this.mainCatalog = mainCatalog;
	}
	//metodi necessari all'implemetazione della ricerca dei dati all'interno del catalogo
	//per autore
	@Override
	public Map<String, Catalogo> searchForAuthor(String autore) {
		return mainCatalog.values().stream().filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));

	}
	//per anno
	@Override
	public Map<String, Catalogo> searchForYear(String y, Map<String, Catalogo> m) {
		return mainCatalog.values().stream().filter(e -> e.getPublicationYear().equals(y))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}
	//per codice ISBN
	@Override
	public Map<String, Catalogo> searchForIsbn(String i, Map<String, Catalogo> m) {
		return mainCatalog.values().stream().filter(e -> e instanceof Libro && ((Libro) e).getISBNcode().equals(i))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}

}
