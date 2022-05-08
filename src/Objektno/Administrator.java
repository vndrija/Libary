package Objektno;

public class Administrator extends Zaposleni {

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol) {
		super(id, ime, prezime, jMBG, adresa, pol);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrator [getKorisnickoime()=" + getKorisnickoime() + ", getKorisinckasifra()="
				+ getKorisinckasifra();
		
				}

	
	

}
