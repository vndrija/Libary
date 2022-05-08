package Objektno;

public abstract class Zaposleni extends Osoba {
	private String korisnickoime;
	private String korisinckasifra;
	public Zaposleni() {
		super();
		this.korisnickoime = "";
		this.korisinckasifra = "";
		
		
	}
	public Zaposleni(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol) {
		super(id, ime, prezime, jMBG, adresa, pol);
		this.korisnickoime = korisnickoime;
		this.korisinckasifra = korisinckasifra;
		
	}
	public String getKorisnickoime() {
		return korisnickoime;
	}
	public void setKorisnickoime(String korisnickoime) {
		this.korisnickoime = korisnickoime;
	}
	public String getKorisinckasifra() {
		return korisinckasifra;
	}
	public void setKorisinckasifra(String korisinckasifra) {
		this.korisinckasifra = korisinckasifra;
	}
	@Override
	public String toString() {
		return "Zaposleni [korisnickoime=" + korisnickoime + ", korisinckasifra=" + korisinckasifra + "]";
	}
	
	
	
	

}
