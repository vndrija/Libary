package Objektno;

import java.time.LocalDate;

public class IzdavanjeKnjige {
	private LocalDate datumIznajmljivanja;
	private LocalDate datumVracanja;
	protected Zaposleni zaposleni;
	protected ClanBiblioteke clanbiblioteke;
	protected PrimerakKnjige primerakknjige;
	public IzdavanjeKnjige(LocalDate datumIznajmljivanja, LocalDate datumVracanja, Zaposleni zaposleni,
			ClanBiblioteke clanbiblioteke, PrimerakKnjige primerakknjige) {
		super();
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.datumVracanja = datumVracanja;
		this.zaposleni = zaposleni;
		this.clanbiblioteke = clanbiblioteke;
		this.primerakknjige = primerakknjige;
	}
	
	public IzdavanjeKnjige() {
		this.datumIznajmljivanja = null;
		this.datumVracanja = null;
		this.zaposleni = null;
		this.clanbiblioteke = null;
		this.primerakknjige = null;
	}

	public LocalDate getDatumIznajmljivanja() {
		return datumIznajmljivanja;
	}

	public void setDatumIznajmljivanja(LocalDate datumIznajmljivanja) {
		this.datumIznajmljivanja = datumIznajmljivanja;
	}

	public LocalDate getDatumVracanja() {
		return datumVracanja;
	}

	public void setDatumVracanja(LocalDate datumVracanja) {
		this.datumVracanja = datumVracanja;
	}

	public Zaposleni getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

	public ClanBiblioteke getClanbiblioteke() {
		return clanbiblioteke;
	}

	public void setClanbiblioteke(ClanBiblioteke clanbiblioteke) {
		this.clanbiblioteke = clanbiblioteke;
	}

	public PrimerakKnjige getPrimerakknjige() {
		return primerakknjige;
	}

	public void setPrimerakknjige(PrimerakKnjige primerakknjige) {
		this.primerakknjige = primerakknjige;
	}

	@Override
	public String toString() {
		return "IzdavanjeKnjige [datumIznajmljivanja=" + datumIznajmljivanja + ", datumVracanja=" + datumVracanja
				+ ", zaposleni=" + zaposleni + ", clanbiblioteke=" + clanbiblioteke + ", primerakknjige="
				+ primerakknjige + "]";
	}
	
	

}
