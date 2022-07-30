package it.epicode.catalogo;

//import java.io.File;
import java.io.IOException;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.stream.Collectors;

//import org.apache.commons.io.FileUtils;

//classe principale per l'esecuzione del programma
public class ArchivioMain {

//	private static final Logger Log = LoggerFactory.getLogger(ArchiveMain.class);
	

	public static void main(String[] args) throws IOException {
		
	   Map<String, Catalogo> mainCatalog = new Service().popolaLista() ;
	   //dichiarazione delle classi usate per la ricerca e scrittura nel catalogo
	   Search s = new SearchClass(mainCatalog);
	   WriteRead wR = new WriteReadClass(mainCatalog);
	   //mostro il catalogo iniziale completo
		System.out.println("CATALOGO INIZIALE COMPLETO:");
		mainCatalog.forEach((k, v) -> System.out.println(v));
		System.out.println("----------------------------");
		System.out.println("");
		//mostro catologo fintrato mediante la ricerca in base all'anno
		System.out.println("RICERCA PER ANNO (2019):");
		Map<String, Catalogo> filteredCatalog2 = s.searchForYear("2019", null);
		filteredCatalog2.forEach((k, v) -> System.out.println(v));
		//catlogo filtrato in base alla ricerca in base all'autore
		System.out.println("RICERCA PER AUTORE (C.S.Lewis):");
		Map<String, Catalogo> filteredCatalog1 = s.searchForAuthor("C.S.Lewis");
		filteredCatalog1.forEach((k, v)->System.out.println(k + " " +v));
		//catalogo filtrato in base all'ISBN
		System.out.println("RICERCA PER ISBN (6527993300140):");
		Map<String, Catalogo> filteredCatalog3 = s.searchForIsbn("6527993300140", null);
		filteredCatalog3.forEach((k, v)->System.out.println(k + " " +v));
		//per ottenere i risultati filtrati in base ai 3 tipi di parametri sono stati creati 3 catalohi filtrati dal catalogo principale
		//per mostrare tutti gli elmenti(libri o riviste) che soddisfnao quei requisiti
		System.out.println("------eccoci---------");
		
		wR.write();
		System.out.println("-----------------ciao-----------");

		
		System.out.println("");

		//saveOnDisk();
		
		System.out.println("LETTURA DOPO SCRITTURA SU DISCO:");//leggo dal file txt creato
		//loadFromDisk();
		
		List<String> ciao= wR.read(); 
		ciao.forEach(System.out::println);

	}
}
