package it.epicode.catalogo;
//classe libro che è collegata alla superclasse Catalogo
public class Libro extends Catalogo {
	//dichiarazione attributi che hanno solo i libri
	private String autore;
	private String genere;
	//costruttore
	public Libro(String iSBNcode, String titolo, String pubblicazioneAnno, int numDiPagine, String autore, String genere) {
		super(iSBNcode, titolo, pubblicazioneAnno, numDiPagine);
		this.autore = autore;
		this.genere = genere;
	}
	//funzioni get e set
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	//funzione per ottenere come stringa l'output delle informazioni del libro
	@Override
	public String toString() {
		return "Libro [ codice ISBN: " + ISBNcode + ", titolo: " + titolo + ", Anno di pubblicazione: " + PubblicazioneAnno
				+ ", N° di pagine: " + numDiPagine + ", autore: " + autore + ", genere: " + genere + " ]";
	}

}