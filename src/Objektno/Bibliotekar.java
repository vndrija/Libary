package Objektno;

public class Bibliotekar extends Zaposleni {

	public Bibliotekar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bibliotekar(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol) {
		super(id, ime, prezime, jMBG, adresa, pol);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bibliotekar [getKorisnickoime()=" + getKorisnickoime() + ", getKorisinckasifra()="
				+ getKorisinckasifra();
		}
	

}
