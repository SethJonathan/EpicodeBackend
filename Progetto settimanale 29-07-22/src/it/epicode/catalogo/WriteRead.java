package it.epicode.catalogo;

import java.io.IOException;
import java.util.List;
//import java.util.Map;

//interfaccia usata per scrivere e leggere gli elememti della lista di libri/riviste
public interface WriteRead {

	public List<String> read() throws IOException;
	public void write() throws IOException;
}
