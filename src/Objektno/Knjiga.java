package Objektno;


public class Knjiga {
	protected String id;
    protected String naslovKnjige;
    protected String originalsniNaslovKnjige;
    protected String pisac;
    protected int godinaObjavljanjaKnjige;
    protected Jezik jezikOriginala;
    protected String opisKnjige;
    protected ZanrKnjige zanr;
    
    
	public Knjiga(String id, String naslovKnjige, String originalsniNaslovKnjige, String pisac,
			int godinaObjavljanjaKnjige, Jezik jezikOriginala, String opisKnjige, ZanrKnjige zanr
			) {
		this.id = id;
		this.naslovKnjige = naslovKnjige;
		this.originalsniNaslovKnjige = originalsniNaslovKnjige;
		this.pisac = pisac;
		this.godinaObjavljanjaKnjige = godinaObjavljanjaKnjige;
		this.jezikOriginala = jezikOriginala;
		this.opisKnjige = opisKnjige;
		this.zanr = zanr;
	}
	
	public Knjiga() {
		super();
		this.id = "";
		this.naslovKnjige = "";
		this.originalsniNaslovKnjige = "";
		this.pisac = "";
		this.godinaObjavljanjaKnjige = 0;
		this.jezikOriginala = null;
		this.opisKnjige = "";
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
	public String getOriginalsniNaslovKnjige() {
		return originalsniNaslovKnjige;
	}
	public void setOriginalsniNaslovKnjige(String originalsniNaslovKnjige) {
		this.originalsniNaslovKnjige = originalsniNaslovKnjige;
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
	public Jezik getJezikOriginala() {
		return jezikOriginala;
	}
	public void setJezikOriginala(Jezik jezikOriginala) {
		this.jezikOriginala = jezikOriginala;
	}
	public String getOpisKnjige() {
		return opisKnjige;
	}
	public void setOpisKnjige(String opisKnjige) {
		this.opisKnjige = opisKnjige;
	}
	public ZanrKnjige getZanr() {
		return zanr;
	}
	public void setZanr(ZanrKnjige zanr) {
		this.zanr = zanr;
	}
	@Override
	public String toString() {
		return id + ";" + naslovKnjige + ";"+ originalsniNaslovKnjige + ";" + pisac + ";" + godinaObjavljanjaKnjige+ ";" + jezikOriginala + ";" + opisKnjige;
	}
    


}


