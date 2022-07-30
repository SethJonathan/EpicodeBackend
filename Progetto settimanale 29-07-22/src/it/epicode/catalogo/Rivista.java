package it.epicode.catalogo;
//classe Rivista collegata alla superclasse Catalogo
public class Rivista extends Catalogo {

	Periodicita periodicita;
	//costruttore
	public Rivista(String iSBNcode, String title, String publicationYear, int numOfPage, Periodicita periodicita) {
		super(iSBNcode, title, publicationYear, numOfPage);
		this.periodicita = periodicita;
	}
	//funzioni get e set
	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}
	//ottenere una stringa in output come per i libri
	@Override
	public String toString() {
		return "Rivista [ codice ISBN: " + ISBNcode + ", titolo: " + titolo + ", Anno di pubblicazione: " + PubblicazioneAnno
				+ ", N° di pagine: " + numDiPagine + ", Periodicità: " + periodicita + " ]";
	}

}
