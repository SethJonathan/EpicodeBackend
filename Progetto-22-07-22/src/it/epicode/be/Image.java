package it.epicode.be;

//classe di tipo imamgine per l'elemento di tipo immagine
public class Image extends MultimediaElement implements Visualizza {
	
	//implemento l'interfaccia VIsualizza e la classe astratta MultiElement
	
	private int luminosita;//dichiaro la luminosità
	
	private int ampLuce;//dichiaro il valore che comparerà la luminosità
	
	//costruttore collegato alla superclasse MultimediaElement
	public Image(String titolo, int luminosita, int ampLuce) {
		super(titolo);
		this.luminosita = luminosita;
		this.ampLuce = ampLuce;
	}
	
	//metodo per alzare la luminosità
	public void aumentaLuminosita() {
		luminosita++;
	}
	//metodo per abbassare la luminosità
	public void diminuisciLuminosita() {
		luminosita--;
	}
	
	//metodo per collegare i "*" alla quantità numerica int della luce(ampLuce)
	public void show(int ampLuce) {
		String repLum = new String(new char[luminosita]).replace("\0", "*");
		for (int l=0; l<ampLuce; l++) {
			System.out.println(titolo + repLum);
		}
	}
	

}
