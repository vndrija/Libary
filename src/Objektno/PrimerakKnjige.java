package Objektno;

public class PrimerakKnjige {
	private String id;
	private int brStrana;
	private boolean tipPoveza;
	private int godinaStampanja;
	private boolean jelIznajmljena;
	protected Knjiga knjiga;
	public PrimerakKnjige(String id, int brStrana, boolean tipPoveza, int godinaStampanja, boolean jelIznajmljena,
			Knjiga knjiga) {
		super();
		this.id = id;
		this.brStrana = brStrana;
		this.tipPoveza = tipPoveza;
		this.godinaStampanja = godinaStampanja;
		this.jelIznajmljena = jelIznajmljena;
		this.knjiga = knjiga;
	}
	
	public PrimerakKnjige() {
		this.id = "";
		this.brStrana = 0;
		this.tipPoveza = false;
		this.godinaStampanja = 0;
		this.jelIznajmljena = false;
		this.knjiga = null;
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

	public boolean isJelIznajmljena() {
		return jelIznajmljena;
	}

	public void setJelIznajmljena(boolean jelIznajmljena) {
		this.jelIznajmljena = jelIznajmljena;
	}

	public Knjiga getKnjiga() {
		return knjiga;
	}

	public void setKnjiga(Knjiga knjiga) {
		this.knjiga = knjiga;
	}

	@Override
	public String toString() {
		return "PrimerakKnjige [id=" + id + ", brStrana=" + brStrana + ", tipPoveza=" + tipPoveza + ", godinaStampanja="
				+ godinaStampanja + ", jelIznajmljena=" + jelIznajmljena + ", knjiga=" + knjiga + "]";
	}
	
	
}
