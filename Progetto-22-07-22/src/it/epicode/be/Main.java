package it.epicode.be;

import java.util.Scanner;

//classe principale per far funzionare l'applicazione
public class Main {
	//scanner per ricevere input da tastiera
	public static Scanner scanner = new Scanner(System.in);
	//leggo numeri interi
	public static int readInt() {
		return Integer.parseInt(scanner.nextLine());
	}
	//leggo stringhe
	public static String readString() {
		return scanner.nextLine();
	}
	//definizione dell'array
	public static void main(String[] args) {
		MultimediaElement[] m = new MultimediaElement[5];
		
		creaArray(m);
		
		scegliMedia(m);
		
	}
	
	//inserisco gli elementi nell'array mediante un ciclo
	private static void creaArray(MultimediaElement[] m) {
		for (int i=0; i<=(m.length - 1); i++) {
			//scelta ipologia elemento
			System.out.println("creazione elemento n°:" + (i + 1) + "/5");
			System.out.println("Seleziona il tipo di elemento multimediale");
			System.out.println("1=audio");
			System.out.println("2=video");
			System.out.println("3=immagine");
			//lettura della scelta
			int tipo = readInt();
			//verifica in base al tipo di elemento
			if (tipo==1) {
				System.out.println("Inserisci titolo canzone: ");
				String titolo = readString();
				System.out.println("Inserisci volume: ");
				int volume = readInt();
				System.out.println("Inserisci durata: ");
				int durata = readInt();
				Audio audio = new Audio (titolo,volume,durata);
				//audio.play(durata); verifica funzionamento
				m[i] = audio;
			} else if (tipo==2) {
				System.out.println("Inserisci titolo video: ");
				String titolo = readString();
				System.out.println("Inserisci volume: ");
				int volume = readInt();
				System.out.println("Inserisci durata: ");
				int durata = readInt();
				System.out.println("Inserisci luminosità: ");
				int luminosita = readInt();
				int ampLuce = luminosita;
				Video video = new Video (titolo,volume,durata,luminosita,ampLuce);
				//video.play(durata); verifica funzionamento
				//video.show(ampLuce); verifica funzionamento
				m[i] = video;
			} else if (tipo==3) {
				System.out.println("Inserisci titolo immagine: ");
				String titolo = readString();
				System.out.println("Inserisci luminosità: ");
				int luminosita = readInt();
				int ampLuce = luminosita;
				Image image = new Image (titolo,luminosita,ampLuce);
				//image.show(ampLuce); verifica funzionamento
				m[i] = image;
			} else {
				//nel caso si fa una scelta da tastiera non corretta
				System.out.println("Tipologia scelta non valida");
		
			}
		}
	}
	
	
	//menu di selezione di cosa riprodurre
	private static void scegliMedia(MultimediaElement[] m) {
		//elemento che va riprodotto su 5 totali
		int mediaElement = 0;
		do {
			System.out.println("Cosa vuoi riprodurre? digita un numero da 1 a 5 oppure 0 per terminare la riproduzione");
			mediaElement = readInt(); //cosa mostro in base all'input dell'utilizzatore
			int scelta = mediaElement -1;
			
			if (mediaElement == 0) {
				System.out.println("termine inserimento");//stop
			}
			
			else if (m[scelta] instanceof Image && scelta > -1) {
				m[scelta].show(); //immagine
			}

			else if (m[scelta] instanceof Audio) {
				m[scelta].play(); //audio
			}
			else if (m[scelta] instanceof Video) {
				m[scelta].play(); //video nella sua durata
				m[scelta].show(); //video nella sua visibilità
			}
			
		} while (mediaElement !=0);
		
	}
	
	//segnalo che il ciclo non funziona ma gli elementi singoli funzionano rifatto più volte e non saprei perchè 
	//non visualizza gli elementi da riprodurre dopo l ascelta dal menù


}


