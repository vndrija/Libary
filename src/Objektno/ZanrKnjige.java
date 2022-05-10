package Objektno;

public class ZanrKnjige {
	protected String oznaka;
	protected String opis;

	public ZanrKnjige(String oznaka, String opis) {
		this.oznaka = oznaka;
		this.opis = opis;
	}
	
	public ZanrKnjige() {
		this.oznaka = "";
		this.opis = "";
	}
	public String getOznaka() {
		return oznaka;
	}
	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Override
	public String toString() {
		return oznaka + ";" + opis;
	}
	

}

