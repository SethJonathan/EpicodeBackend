package it.epicode.be;

//classe di tipo Video per l'elemento di tipo video
public class Video extends MultimediaElement implements Riproduci, Visualizza {

	//implemento l'interfaccia Visualizza,Riproduci e la classe astratta MultiElement essendo un video
	
	private int volume;//dichiaro il volume
	
	private int durata;//dichiaro la durata
	
	private int luminosita;//dichiaro l aluminosità
	
	private int ampLuce;//dichiaro il valore che comparerà la luminosità
	
	//costruttore collegato alla superclasse MultimediaElement
	public Video(String titolo, int volume, int durata, int luminosita, int ampLuce) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
		this.luminosita = luminosita;
		this.ampLuce = ampLuce;
	}
	//metodo per abbassare il volume
	public void abbassaVolume() {
		volume--;
	}
	//metodo per alzare il volume
	public void alzaVolume() {
		volume++;
	}
	
	//metodo per alzare la luminosità
	public void aumentaLuminosita() {
		luminosita++;
	}
	//metodo per abbassare la luminosità
	public void diminuisciLuminosita() {
		luminosita--;
	}
	//metodo per collegare i "!" alla durata numerica int del video
	public void play(int durata) {
		String repVol = new String(new char[volume]).replace("\0", "!");
		for (int i=0; i<durata; i++) {
			System.out.println(titolo + repVol);
		}
	}//grazie a un ciclo aggiungo lo stesso carattere quanto è alto il valore numerico int della durata del video
	
	//metodo per collegare i "*" alla quantità numerica int della luce(ampLuce)
	public void show(int ampLuce) {
		String repLum = new String(new char[luminosita]).replace("\0", "*");
		for (int l=0; l<ampLuce; l++) {
			System.out.println(titolo + repLum);
		}//stesso funzionamento simile a play
	}

}
