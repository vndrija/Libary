package Objektno;

public abstract class Osoba {
	private String id;
	private String ime;
	private String prezime;
	private String JMBG;
	private String adresa;
	private EnumPol pol;
	public Osoba(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		JMBG = jMBG;
		this.adresa = adresa;
		this.pol = pol;
	}
	
	public Osoba() {
		this.id = "";
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
		this.adresa = "";
		this.pol = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public EnumPol getPol() {
		return pol;
	}

	public void setPol(EnumPol pol) {
		this.pol = pol;
	}

	@Override
	public String toString() {
		return "Osoba [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", adresa=" + adresa
				+ ", pol=" + pol + "]";
	}
	
	

}
