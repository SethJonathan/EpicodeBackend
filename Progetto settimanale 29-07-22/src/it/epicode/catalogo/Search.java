package it.epicode.catalogo;

//import java.util.List;
import java.util.Map;
//interfaccia che indica i metodi d ricerca che verranno implementati per filtrare l'output del catoalogo riviste/libri
public interface Search {
	public Map<String, Catalogo> searchForAuthor(String autore) ;
	public Map<String, Catalogo>searchForYear(String y, Map<String, Catalogo> m) ;
	public Map<String, Catalogo> searchForIsbn(String i, Map<String, Catalogo> m) ;
}
