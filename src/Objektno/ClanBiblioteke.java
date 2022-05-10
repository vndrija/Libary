package Objektno;
import java.time.LocalDate;

public class ClanBiblioteke extends Osoba{
	protected String brClankarte;
    protected LocalDate datumPoslednjeUplate;
    protected int brojMeseciClanarine;
    protected boolean aktivan;
    protected TipClanarine tipClanarine;
    
   
	public ClanBiblioteke(String id, String ime, String prezime, String jMBG, String adresa, EnumPol pol,
			String brClankarte, LocalDate datumPoslednjeUplate, int brojMeseciClanarine, boolean aktivan,
			TipClanarine tipClanarine) {
		super(id, ime, prezime, jMBG, adresa, pol);
		this.brClankarte = brClankarte;
		this.datumPoslednjeUplate = datumPoslednjeUplate;
		this.brojMeseciClanarine = brojMeseciClanarine;
		this.aktivan = aktivan;
		this.tipClanarine = tipClanarine;
	}
	
	public ClanBiblioteke() {
		super();
		this.brClankarte = "";
		this.datumPoslednjeUplate = null;
		this.brojMeseciClanarine = 0;
		this.aktivan = false;
		this.tipClanarine = null;
		
	}


	public String getBrClankarte() {
		return brClankarte;
	}
	public void setBrClankarte(String brClankarte) {
		this.brClankarte = brClankarte;
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
	public boolean getAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	public TipClanarine getTipClanarine() {
		return tipClanarine;
	}
	public void setTipClanarine(TipClanarine tipClanarine) {
		this.tipClanarine = tipClanarine;
	}
	


	@Override
	public String toString() {
		return id+";"+ime+";"+prezime+";"+JMBG+";"+adresa+";"+pol+";"+brClankarte+";"+datumPoslednjeUplate+";"+ brojMeseciClanarine+";"+aktivan+";"+tipClanarine;
	}
	


	
	
	

    
    
    
	

}

