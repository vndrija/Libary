package Objektno;



public class PrimerakKnjige {
	protected String id;
    protected int brStrana;
    protected boolean tipPoveza;
    protected int godinaStampanja;
    protected boolean jeliIznajmljena;
    protected Knjiga knjiga;
    
    
	public PrimerakKnjige(String id, int brStrana, boolean tipPoveza, int godinaStampanja, boolean jeliIznajmljena,
			Knjiga knjiga) {
		this.id = id;
		this.brStrana = brStrana;
		this.tipPoveza = tipPoveza;
		this.godinaStampanja = godinaStampanja;
		this.jeliIznajmljena = jeliIznajmljena;
		this.knjiga = knjiga;
	}
	
	public PrimerakKnjige() {
		this.id = "";
		this.brStrana = 0;
		this.tipPoveza = false;
		this.godinaStampanja = 0;
		this.jeliIznajmljena = false;
		this.knjiga = new Knjiga();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBrStrana() {
		return brStrana;
	}
	public void setBrStrana(int brStrana) {
		this.brStrana = brStrana;
	}
	public boolean isTipPoveza() {
		return tipPoveza;
	}
	public void setTipPoveza(boolean tipPoveza) {
		this.tipPoveza = tipPoveza;
	}
	public int getGodinaStampanja() {
		return godinaStampanja;
	}
	public void setGodinaStampanja(int godinaStampanja) {
		this.godinaStampanja = godinaStampanja;
	}
	public boolean isJeliIznajmljena() {
		return jeliIznajmljena;
	}
	public void setJeliIznajmljena(boolean jeliIznajmljena) {
		this.jeliIznajmljena = jeliIznajmljena;
	}
	public Knjiga getKnjiga() {
		return knjiga;
	}
	public void setKnjiga(Knjiga knjiga) {
		this.knjiga = knjiga;
	}

	@Override
	public String toString() {
		return id + ";" + brStrana + ";" + tipPoveza + ";"+ godinaStampanja + ";" + jeliIznajmljena+";"+knjiga;
	}
	

}
