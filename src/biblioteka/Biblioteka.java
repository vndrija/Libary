package biblioteka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import enumeracije.JezikOriginala;
import enumeracije.Pol;
import ljudi.Administrator;
import ljudi.Bibliotekar;
import ljudi.Clan;
import ljudi.TipClanarine;
import ljudi.Zaposleni;

public class Biblioteka {	
	
	
	
	
	

    protected String naziv;
    protected String adresa;
    protected String telefon;
    protected LocalDate radiOd;
    protected LocalDate radiDo;
    protected String id;
    protected ArrayList<Knjiga> knjige;
    protected ArrayList<ZanrKnjige> zanrovi;
    protected ArrayList<Administrator> admin;
    protected ArrayList<Clan> clanBiblioteke;
    protected ArrayList<Iznajmljivanje> iznajmljivanjeKnjige;
    protected ArrayList<TipClanarine> tipClanarine;
    protected ArrayList<PrimerakKnjige> primerakKnjige;
    protected ArrayList<Zaposleni> zaposleni;
    protected ArrayList<Bibliotekar> bibliotekar;

    
    public Biblioteka() {
    	
    	this.naziv = "";
    	this.adresa = "";
    	this.telefon = "";
    	this.id = "";
    	this.radiOd = null;
    	this.radiDo = null;
    	this.admin = new ArrayList<Administrator>();
    	this.knjige = new ArrayList<Knjiga>();
    	this.zanrovi = new ArrayList<ZanrKnjige>();
    	this.clanBiblioteke = new ArrayList<Clan>();
    	this.tipClanarine = new ArrayList<TipClanarine>();
    	this.iznajmljivanjeKnjige = new ArrayList<Iznajmljivanje>();
    	this.primerakKnjige = new ArrayList<PrimerakKnjige>();
    	this.zaposleni = new ArrayList<Zaposleni>();
    	this.bibliotekar = new ArrayList<Bibliotekar>();
    
    }
    
    public Biblioteka(String naziv, String adresa, String telefon, LocalDate radiOd, LocalDate radiDo, String id) {
    	
    	super();
    	this.naziv = naziv;
    	this.adresa = adresa;
    	this.telefon = telefon;
    	this.id = id;
    	this.radiOd = radiOd;
    	this.radiDo = radiDo;
    	this.admin = new ArrayList<Administrator>();
    	this.knjige = new ArrayList<Knjiga>();
    	this.zanrovi = new ArrayList<ZanrKnjige>();
    	this.clanBiblioteke = new ArrayList<Clan>();
    	this.tipClanarine = new ArrayList<TipClanarine>();
    	this.iznajmljivanjeKnjige = new ArrayList<Iznajmljivanje>();
    	this.primerakKnjige = new ArrayList<PrimerakKnjige>();
    	this.zaposleni = new ArrayList<Zaposleni>();
    	this.bibliotekar = new ArrayList<Bibliotekar>();
    }

    public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public LocalDate getRadiOd() {
		return radiOd;
	}
	public void setRadiOd(LocalDate radiOd) {
		this.radiOd = radiOd;
	}
	public LocalDate getRadiDo() {
		return radiDo;
	}
	public void setRadiDo(LocalDate radiDo) {
		this.radiDo = radiDo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Knjiga> getKnjige() {
		return knjige;
	}
	public void setKnjige(ArrayList<Knjiga> knjige) {
		this.knjige = knjige;
	}
	public ArrayList<ZanrKnjige> getZanrovi() {
		return zanrovi;
	}
	public void setZanrovi(ArrayList<ZanrKnjige> zanrovi) {
		this.zanrovi = zanrovi;
	}
	public ArrayList<Administrator> getAdmin() {
		return admin;
	}
	public void setAdmin(ArrayList<Administrator> admin) {
		this.admin = admin;
	}
	public ArrayList<Clan> getClanBiblioteke() {
		return clanBiblioteke;
	}
	public void setClanBiblioteke(ArrayList<Clan> clanBiblioteke) {
		this.clanBiblioteke = clanBiblioteke;
	}
	public ArrayList<Iznajmljivanje> getIznajmljivanjeKnjige() {
		return iznajmljivanjeKnjige;
	}
	public void setIznajmljivanjeKnjige(ArrayList<Iznajmljivanje> iznajmljivanjeKnjige) {
		this.iznajmljivanjeKnjige = iznajmljivanjeKnjige;
	}
	public ArrayList<TipClanarine> getTipClanarine() {
		return tipClanarine;
	}
	public void setTipClanarine(ArrayList<TipClanarine> tipClanarine) {
		this.tipClanarine = tipClanarine;
	}
	public ArrayList<PrimerakKnjige> getPrimerakKnjige() {
		return primerakKnjige;
	}
	public void setPrimerakKnjige(ArrayList<PrimerakKnjige> primerakKnjige) {
		this.primerakKnjige = primerakKnjige;
	}
	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}
	public void setZaposleni(ArrayList<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}
	public ArrayList<Bibliotekar> getBibliotekar() {
		return bibliotekar;
	}
	public void setBibliotekar(ArrayList<Bibliotekar> bibliotekar) {
		this.bibliotekar = bibliotekar;
	}

	public Zaposleni login(String korisnickoIme, String lozinka) {
			for (Bibliotekar bibliotekar : this.bibliotekar) {
				if(bibliotekar.getKorisnickoIme().equalsIgnoreCase(korisnickoIme)&& bibliotekar.getLozinka().equals(lozinka) && 
						!bibliotekar.isObrisan()) {
					return bibliotekar;
				}
			}
			for(Administrator admin : this.admin) {
				if(admin.getKorisnickoIme().equalsIgnoreCase(korisnickoIme) &&
						admin.getLozinka().equals(lozinka) && !admin.isObrisan()) {
					return admin;
				}
			}
			return null;
		}
	
	
	public void citajClanarine() throws IOException{
		this.tipClanarine = new ArrayList<TipClanarine>();
		File file = new File("fajlovi/tipclanarine.txt");
		BufferedReader citanje = new BufferedReader(new FileReader(file));
		String line1 = null;
		while((line1 = citanje.readLine())!= null) {
			String[]nizClanova = line1.split("\\|");
			String id = nizClanova[0];
			String tip = nizClanova[1];
			int cena = Integer.parseInt(nizClanova[2]);
			TipClanarine tip2  = new TipClanarine(id, tip, cena, false);
			tipClanarine.add(tip2);
		}
		citanje.close();
	}
	public void upisiTipClanarine(TipClanarine t) throws IOException{
		File file = new File("fajlovi/tipclanarine.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		String sb = t.getTip()+ "|"+ t.getId()+ "|"+t.getCena();
		writer.write(sb);
		writer.newLine();;
		writer.close();
	}
	public void sacuvajTipClanarine() throws IOException{
        File file=new File("projekatObjektno/tipclanarine.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(TipClanarine c : this.tipClanarine) {
            String linija = c.getTip() + "|" +c.getId() + "|" +c.getCena();
            writer.write(linija);
            writer.newLine();
        }
        writer.close();
    }
	public ArrayList<TipClanarine> sviNeobrisaniTipovi() {
		ArrayList<TipClanarine> neobrisani = new ArrayList<TipClanarine>();
		for (TipClanarine tipovi : tipClanarine) {
			if(!tipovi.isObrisan()) {
				neobrisani.add(tipovi);
			}
		}
		return neobrisani;
	}
	public TipClanarine pronadjiTip(String id) {
		for (TipClanarine tip : this.tipClanarine) {
			if(tip.getId().equals(id)) {
				return tip;
			}
		}
		return null;
	}
	

}


