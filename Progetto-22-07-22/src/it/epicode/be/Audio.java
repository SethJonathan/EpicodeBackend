package it.epicode.be;

//classe di tipo audio per l'elemento di tipo audio
public class Audio extends MultimediaElement implements Riproduci {
	
	//implemento l'interfaccia Riproduci e la classe astratta MultiELement
	
	private int volume;//dichiaro volume
	
	private int durata;//dichiaro durata
	
	//costruttore collegato alla superclasse MultimediaElement
	public Audio(String titolo, int volume,int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}
	
	//metodo per abbassare il volume
	public void abbassaVolume() {
		volume--;
	}
	
	//metodo per alzare il volume
	public void alzaVolume() {
		volume++;
	}
	
	//metodo per collegare i "!" alla durata numerica int della canzone
	public void play(int durata) {
		String repVol = new String(new char[volume]).replace("\0", "!");
		for (int i=0; i<durata; i++) {
			System.out.println(titolo + repVol);
		}
	}//grazie a un ciclo aggiungo lo stesso carattere quanto è alto il valore numerico int della durata
}
