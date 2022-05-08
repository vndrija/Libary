package Objektno;

import java.time.LocalDate;

public class ClanBiblioteke extends Osoba {
	private String brClanKarte;
	private LocalDate datumPoslednjeUplate;
	private int brojMeseciClanarine;
	private boolean aktivan;
	protected TipClanarine tipclanarine;
	public ClanBiblioteke() {
		super();
		this.brClanKarte = "";
		this.datumPoslednjeUplate = null;
		this.brojMeseciClanarine = 0;
		this.aktivan = false;
		this.tipclanarine = null;
	}
	public ClanBiblioteke(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol) {
		super(id, ime, prezime, jMBG, adresa, pol);
		this.brClanKarte = brClanKarte;
		this.datumPoslednjeUplate = datumPoslednjeUplate;
		this.brojMeseciClanarine = brojMeseciClanarine;
		this.aktivan = aktivan;
		this.tipclanarine = tipclanarine;
		
	}
	public String getBrClanKarte() {
		return brClanKarte;
	}
	public void setBrClanKarte(String brClanKarte) {
		this.brClanKarte = brClanKarte;
	}
	public LocalDate getDatumPoslednjeUplate() {
		return datumPoslednjeUplate;
	}
	public void setDatumPoslednjeUplate(LocalDate datumPoslednjeUplate) {
		this.datumPoslednjeUplate = datumPoslednjeUplate;
	}
	public int getBrojMeseciClanarine() {
		return brojMeseciClanarine;
	}
	public void setBrojMeseciClanarine(int brojMeseciClanarine) {
		this.brojMeseciClanarine = brojMeseciClanarine;
	}
	public boolean isAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	public TipClanarine getTipclanarine() {
		return tipclanarine;
	}
	public void setTipclanarine(TipClanarine tipclanarine) {
		this.tipclanarine = tipclanarine;
	}
	@Override
	public String toString() {
		return "ClanBiblioteke [brClanKarte=" + brClanKarte + ", datumPoslednjeUplate=" + datumPoslednjeUplate
				+ ", brojMeseciClanarine=" + brojMeseciClanarine + ", aktivan=" + aktivan + ", tipclanarine="
				+ tipclanarine + "]";
	}
	
	
}
