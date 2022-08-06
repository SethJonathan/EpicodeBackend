package it.epicode.entities.library;
//gestione riviste
import javax.persistence.Entity;

@Entity
public class Riviste extends Elemento {

	Periodicita periodicita;

	public Riviste(String codiceISBN, String titolo, String annoPublicazione, int nPagine, Periodicita periodicita) {
		super(codiceISBN, titolo, annoPublicazione, nPagine);
		this.periodicita = periodicita;
	}

	public Riviste() {
		super();
	}

	public Riviste(String codiceISBN, String titolo, String annoPublicazione, int nPagine) {
		super(codiceISBN, titolo, annoPublicazione, nPagine);
	}

	public Riviste(Periodicita periodicita) {
		this();
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", codiceISBN=" + codiceISBN + ", titolo=" + titolo
				+ ", annoPublicazione=" + annoPublicazione + ", nPagine=" + nPagine + "]@";
	}

	public static Riviste fromStringFile(String stringFile) {
		String[] split = stringFile.split("@");
		Periodicita periodicita = Periodicita.valueOf(split[5]);

		return new Riviste(split[1], split[2], split[3], Integer.valueOf(split[4]), periodicita);
	}

}
