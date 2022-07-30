package it.epicode.catalogo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
//classe che implementa l'interfaccia della lettura/scrittura della lista
public class WriteReadClass implements WriteRead{
	
	public Map<String, Catalogo> mainCatalog;
	//costruttore della classe relativa alla lettura/scrittura della lista nel catalogo
	public WriteReadClass(Map<String, Catalogo> mainCatalog) {

		this.mainCatalog = mainCatalog;
	}
	//metodo per la scrittura
	@Override
	public void write() throws IOException {

		String catalogToText = "";

		for (Catalogo cat : mainCatalog.values()) {
			catalogToText += (cat.toString() + ";");
		}

		File catalogFile = new File("./catalog.txt");
		//scrivo le stringe sul file txt
		FileUtils.writeStringToFile(catalogFile, catalogToText, "UTF-8");
		
	}
	//metodo per la lettura
	@Override
	public List<String> read() throws IOException {
		List<String> listaRead= new ArrayList<String>();
		
		File file = new File("./catalog.txt");
		//leggo le stringhe nel file txt
		String readString = FileUtils.readFileToString(file, "UTF-8");
		String[] catalog = readString.split(";");
		//cilo la lettura per ogni singolo elemento libro/rivista
		for (String element : catalog) {
			listaRead.add(element);
	}
	return listaRead;//ottengo la lista letta completamente
	}
	
	
}
