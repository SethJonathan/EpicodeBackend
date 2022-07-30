package it.epicode.catalogo;

//superclasse catalogo da applicare a libri e riviste
public abstract class Catalogo {
	//dichiarazione delle variabili che sono in comune tra i libri e le riviste
	protected String ISBNcode;
	protected String titolo;
	protected String PubblicazioneAnno;
	protected int numDiPagine;
	//costruttore
	public Catalogo(String iSBNcode, String titolo, String pubblicazioneAnno, int numOfPage) {
		this.ISBNcode = iSBNcode;
		this.titolo = titolo;
		this.PubblicazioneAnno = pubblicazioneAnno;
		this.numDiPagine = numOfPage;
	}
	//funzioni get e set
	public String getISBNcode() {
		return ISBNcode;
	}

	public void setISBNcode(String iSBNcode) {
		ISBNcode = iSBNcode;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getPublicationYear() {
		return PubblicazioneAnno;
	}

	public void setPublicationYear(String pubblicazioneAnno) {
		PubblicazioneAnno = pubblicazioneAnno;
	}

	public int getNumDiPagine() {
		return numDiPagine;
	}

	public void setNumDiPagine(int numDiPagine) {
		this.numDiPagine = numDiPagine;
	}

}
