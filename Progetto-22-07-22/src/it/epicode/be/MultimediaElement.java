package it.epicode.be;

public abstract class MultimediaElement {
	
	//definizione titolo che è l'elemento in comune inizialmente ai tipi di elementi
	protected String titolo;
	
	//definzione costruttore titolo
	public MultimediaElement(String titolo) {
		//assegnazione titolo, durata e volume dell'elemento
		this.titolo = titolo;	
	}
	public void play(){};
	public void show(){}
	
	/*
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	};*/
	

}
