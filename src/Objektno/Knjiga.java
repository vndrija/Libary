package Objektno;

public class Knjiga {
	private String id;
	private String naslovKnjige;
	private String originalanNaslovKnjige;
	private String pisac;
	private int godinaObjavljanjaKnjige;
	private String opisKnjige;
	protected Jezik jezikoriginala;
	protected ZanrKnjige zanr;
	public Knjiga(String id, String naslovKnjige, String originalanNaslovKnjige, String pisac, int godinaObjavljanjaKnjige,
			String opisKnjige, Jezik jezikoriginala, ZanrKnjige zanr) {
		super();
		this.id = id;
		this.naslovKnjige = naslovKnjige;
		this.originalanNaslovKnjige = originalanNaslovKnjige;
		this.pisac = pisac;
		this.godinaObjavljanjaKnjige = godinaObjavljanjaKnjige;
		this.opisKnjige = opisKnjige;
		this.jezikoriginala = jezikoriginala;
		this.zanr = zanr;
	}
	
	public Knjiga() {
		this.id = "";
		this.naslovKnjige = "";
		this.originalanNaslovKnjige = "";
		this.pisac = "";
		this.godinaObjavljanjaKnjige = 0;
		this.opisKnjige = "";
		this.jezikoriginala = null;
		this.zanr = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNaslovKnjige() {
		return naslovKnjige;
	}

	public void setNaslovKnjige(String naslovKnjige) {
		this.naslovKnjige = naslovKnjige;
	}

	public String getOriginalanNaslovKnjige() {
		return originalanNaslovKnjige;
	}

	public void setOriginalanNaslovKnjige(String originalanNaslovKnjige) {
		this.originalanNaslovKnjige = originalanNaslovKnjige;
	}

	public String getPisac() {
		return pisac;
	}

	public void setPisac(String pisac) {
		this.pisac = pisac;
	}

	public int getGodinaObjavljanjaKnjige() {
		return godinaObjavljanjaKnjige;
	}

	public void setGodinaObjavljanjaKnjige(int godinaObjavljanjaKnjige) {
		this.godinaObjavljanjaKnjige = godinaObjavljanjaKnjige;
	}

	public String getOpisKnjige() {
		return opisKnjige;
	}

	public void setOpisKnjige(String opisKnjige) {
		this.opisKnjige = opisKnjige;
	}

	public Jezik getJezikoriginala() {
		return jezikoriginala;
	}

	public void setJezikoriginala(Jezik jezikoriginala) {
		this.jezikoriginala = jezikoriginala;
	}

	public ZanrKnjige getZanr() {
		return zanr;
	}

	public void setZanr(ZanrKnjige zanr) {
		this.zanr = zanr;
	}

	@Override
	public String toString() {
		return "Knjiga [id=" + id + ", naslovKnjige=" + naslovKnjige + ", originalanNaslovKnjige="
				+ originalanNaslovKnjige + ", pisac=" + pisac + ", godinaObjavljanjaKnjige=" + godinaObjavljanjaKnjige
				+ ", opisKnjige=" + opisKnjige + ", jezikoriginala=" + jezikoriginala + ", zanr=" + zanr + "]";
	}

	
	
	
	
	
}
