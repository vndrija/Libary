package Objektno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;




public class Biblioteka {
	protected String naziv;
	protected String adresa;
	protected String telefon;
	protected LocalDate otvaranje;
	protected LocalDate zatvaranje;
	protected String id;
	protected ArrayList<Knjiga> knjige;
	protected ArrayList<ZanrKnjige> zanrovi; 
	protected ArrayList<Administrator> admin;
	protected ArrayList<ClanBiblioteke> clanbiblioteke;
	protected ArrayList<TipClanarine> tipClanarine;
	protected ArrayList<PrimerakKnjige> primerak;
	
	public Biblioteka(String naziv, String adresa, String telefon, LocalDate otvaranje, LocalDate zatvaranje,
			String id) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.telefon = telefon;
		this.otvaranje = otvaranje;
		this.zatvaranje = zatvaranje;
		this.id = id;
		this.knjige = null;

	}
	public Biblioteka() {
		this.naziv = "";
		this.adresa = "";
		this.telefon = "";
		this.otvaranje = null;
		this.zatvaranje = null;
		this.id = "";
		this.knjige = null;
		this.zanrovi = null;
		this.tipClanarine = null;
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
	public LocalDate getOtvaranje() {
		return otvaranje;
	}
	public void setOtvaranje(LocalDate otvaranje) {
		this.otvaranje = otvaranje;
	}
	public LocalDate getZatvaranje() {
		return zatvaranje;
	}
	public void setZatvaranje(LocalDate zatvaranje) {
		this.zatvaranje = zatvaranje;
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
	public ArrayList<ClanBiblioteke> getClanbiblioteke() {
		return clanbiblioteke;
	}
	public void setClanbiblioteke(ArrayList<ClanBiblioteke> clanbiblioteke) {
		this.clanbiblioteke = clanbiblioteke;
	}
	public ArrayList<TipClanarine> getTipClanarine() {
		return tipClanarine;
	}
	public void setTipClanarine(ArrayList<TipClanarine> tipClanarine) {
		this.tipClanarine = tipClanarine;
	}
	
	public ArrayList<Administrator> citajAdministratora(String imeFajla) throws IOException{
		ArrayList<Administrator> administartor = new ArrayList<Administrator>();
		File fajl = new File(imeFajla);
		BufferedReader citaj = new BufferedReader(new FileReader(fajl));
		String line = null;
		while((line = citaj.readLine())!= null) {
			String [] niz = line.split(";");
			String id = niz[0];
			String ime = niz[1];
			String prezime = niz[2];
			String JMBG = niz[3];
			String adresa = niz[4];
			String defpol1 = niz[5];
			EnumPol defpol = EnumPol.MUSKI;
			for(EnumPol p:EnumPol.values()) {
				if(p.name().equalsIgnoreCase(defpol1)){
					defpol = p;
				}
			}
			String korisnickaSifra = niz[6];
			String korisnickoIme = niz[7];
			Administrator admin = new Administrator(id,ime,prezime,JMBG,adresa,defpol,korisnickaSifra,korisnickoIme);
			administartor.add(admin);
			}
		citaj.close();
		return administartor;	
	}
	public void upisiFajlAdministartor(Administrator a) throws IOException{
		File file = new File("Objektno/administartor.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String sb = a.getId() +";"+ a.getIme() + ";"+a.getPrezime()+ ";"+a.getJMBG() +";"+ a.getAdresa()+ ";" +a.getPol() +";"+a.getKorisnickaSifra()+";"+a.getKorisnickoIme();
			writer.write(sb);
			writer.newLine();
		writer.close();
	}

	public ArrayList<Bibliotekar> citajBibliotekara(String imeFajla) throws IOException{
		ArrayList<Bibliotekar> bibliotekar = new ArrayList<Bibliotekar>();
		File fajl = new File(imeFajla);
		BufferedReader citaj = new BufferedReader(new FileReader(fajl));
		String line = null;
		while((line = citaj.readLine())!= null) {
			String [] niz = line.split(";");
			String id = niz[0];
			String ime = niz[1];
			String prezime = niz[2];
			String JMBG = niz[3];
			String adresa = niz[4];
			String defpol1 = niz[5];
			EnumPol defpol = EnumPol.MUSKI;
			for(EnumPol p:EnumPol.values()) {
				if(p.name().equalsIgnoreCase(defpol1)){
					defpol = p;
				}
			}
			String korisnickaSifra = niz[6];
			String korisnickoIme = niz[7];
			Bibliotekar bibl = new Bibliotekar(id,ime,prezime,JMBG,adresa,defpol,korisnickaSifra,korisnickoIme);
			bibliotekar.add(bibl);
			}
		citaj.close();
		return bibliotekar;	
	}
	public void upisiFajlBibliotekar(Bibliotekar b) throws IOException{
		File file = new File("Objektno/bibliotekar.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String sb = b.getId() +";"+ b.getIme() + ";"+b.getPrezime()+ ";"+b.getJMBG() +";"+ b.getAdresa()+ ";" +b.getPol() +";"+b.getKorisnickaSifra()+";"+b.getKorisnickoIme();
			writer.write(sb);
			writer.newLine();
		writer.close();
	}
	
	public ArrayList<Knjiga> citajKnjige(String imeFajla) throws IOException{
		ArrayList<Knjiga> knjige = new ArrayList<Knjiga>();
		File fajl = new File(imeFajla);
		BufferedReader citaj = new BufferedReader(new FileReader(fajl));
		String line = null;
		while((line = citaj.readLine())!= null) {
			String [] niz = line.split(";");
			String naslovKnjige = niz[0];
			String opisKnjige = niz[1];
			String pisac = niz[2];
			String originalsniNaslovKnjige = niz[3];
			int godinaObjavljanjaKnjige = Integer.parseInt(niz[4]);
			String jezikOroginala = niz[5];
			Jezik jezikOriginala = Jezik.ENGLESKI;
			for (Jezik j: Jezik.values()) {
				if(j.name().equalsIgnoreCase(jezikOroginala)){
					jezikOriginala = j;
				}
			}
			String id  = niz[6];
			ArrayList<ZanrKnjige> zanrovisvi = citajZanroveIzFajla("Objektno/zanrovi.txt");
			ZanrKnjige zanr = null;
			for (ZanrKnjige z: zanrovisvi) {
				if (z.getId().equals(niz[7])) {
					zanr = z;
				}
			}
			Knjiga knjiga = new Knjiga( id, naslovKnjige,originalsniNaslovKnjige,pisac,godinaObjavljanjaKnjige,jezikOriginala,opisKnjige,zanr);
			knjige.add(knjiga);
		}
		citaj.close();
		return knjige;
	}
	public void upisiKnjigu(Knjiga k) throws IOException{
		File file = new File("Objektno/knjige.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String sb = k.getNaslovKnjige() +";"+ k.getOpisKnjige() + ";"+k.getPisac()+ ";"+k.getOriginalsniNaslovKnjige() +";"+ k.getGodinaObjavljanjaKnjige()+ ";" +k.getJezikOriginala() +";"+k.getId()+";"+k.getZanr();
			writer.write(sb);
			writer.newLine();
		writer.close();
		
	}
	
	public ArrayList<ZanrKnjige> citajZanroveIzFajla(String imeFajla) throws IOException{
		ArrayList<ZanrKnjige> zanrknjige = new ArrayList<ZanrKnjige>();
		File fajl = new File(imeFajla);
		BufferedReader citaj = new BufferedReader(new FileReader(fajl));
		String line = null;
		while((line = citaj.readLine())!= null) {
			String [] niz = line.split(";");
			String oznaka = niz[0];
			String opis = niz[1];
			String id = niz[2];
			ZanrKnjige zanr = new ZanrKnjige(oznaka,opis,id);
			zanrknjige.add(zanr);
		}
		citaj.close();
		return zanrknjige;	
	}
	
	public void upisiZanrKnjige (ZanrKnjige z) throws IOException{
        File file = new File("Objektno/zanrovi.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String sb = z.getOznaka() + ";"+ z.getOpis() + ";" + z.getId();
        writer.write(sb);
        writer.newLine();
        writer.close();
    }
	public void upisiAtributeBiblioteke(Biblioteka k ) throws IOException{
		File file = new File("Objektno/biblioteka.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			String sb = k.getAdresa() +";"+ k.getId() +";"+ k.getNaziv() + ";"+k.getTelefon()+ ";"+k.getOtvaranje() +";" +k.getZatvaranje();
			writer.write(sb);
			writer.newLine();
		writer.close();
		
	}
	
	public static ArrayList<ClanBiblioteke> citajClanove(String fajlClanovi)throws IOException{
		ArrayList<ClanBiblioteke> clanovi = new ArrayList<ClanBiblioteke>();
		File claoviFile = new File(fajlClanovi);
		BufferedReader citanje = new BufferedReader(new FileReader(claoviFile));
		String line1 = null;
		while((line1 = citanje.readLine())!= null) {
			String[]nizClanova = line1.split(";");
			String id = nizClanova[0];
			String ime = nizClanova[1];
			String prezime = nizClanova[2];
			String JMBG = nizClanova[3];
			String adresa = nizClanova[4];
			String polClana = nizClanova[5];
			EnumPol defpol = EnumPol.MUSKI;
			for(EnumPol pol:EnumPol.values()) {
				if(pol.name().equalsIgnoreCase(polClana)) {
					defpol = pol;
				}
			}
			String brClankarte  = nizClanova[6];
			LocalDate datumPoslednjeUplate = LocalDate.parse(nizClanova[7]);
			int brojMeseciClanarine = Integer.parseInt(nizClanova[8]);
			boolean aktivan = Boolean.parseBoolean(nizClanova[9]);
			ArrayList<TipClanarine> tip = citajClanarine("Objektno/tipclanarine.txt");
			TipClanarine tip1 = null;
			for (TipClanarine t : tip) {
				System.out.println(nizClanova[10]);
				System.out.println(t.getId());
				if(t.getId().equals(nizClanova[10])) {
					tip1 = t;
				}
			}
			ClanBiblioteke clan = new ClanBiblioteke(id,ime,prezime,JMBG,adresa,defpol,brClankarte,datumPoslednjeUplate,brojMeseciClanarine,aktivan,tip1);
			clanovi.add(clan);
		}
		citanje.close();
		return clanovi;
	}
	public void upisiClanaBiblioteke(ClanBiblioteke c) throws IOException{
	File file = new File("Objektno/clanoviBiblioteke.txt");
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		String sb = c.getId() +";"+ c.getIme() + ";"+c.getPrezime()+ ";"+c.getJMBG() +";"+ c.getAdresa()+ ";" +c.getPol() +";"+c.getBrClankarte()+";"+c.getDatumPoslednjeUplate()+";"+c.getBrojMeseciClanarine()+ ";"+c.getAktivan()+";"+c.getTipClanarine();
		writer.write(sb);
		writer.newLine();
	writer.close();
}
	public static ArrayList<TipClanarine> citajClanarine(String fajlClanovi) throws IOException{
		ArrayList<TipClanarine> tipClanarine = new ArrayList<TipClanarine>();
		File file = new File(fajlClanovi);
		BufferedReader citanje = new BufferedReader(new FileReader(file));
		String line1 = null;
		while((line1 = citanje.readLine())!= null) {
			String[]nizClanova = line1.split(";");
			String id = nizClanova[0];
			String naziv = nizClanova[1];
			double cena = Double.parseDouble(nizClanova[2]);
			TipClanarine tip = new TipClanarine(id,naziv,cena);
			tipClanarine.add(tip);
		}
		citanje.close();
		return tipClanarine;
		
	}
	public void upisiTipClanarine(TipClanarine t) throws IOException{
		File file = new File("Objektno/tipclanarine.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String sb = t.getId()+ ";"+ t.getNaziv()+ ";"+t.getCena();
			writer.write(sb);
			writer.newLine();;
		writer.close();
	}
	
	public ArrayList<PrimerakKnjige> citajPrimerke(String imeFajla) throws IOException{
        ArrayList<PrimerakKnjige> primerakKnjige = new ArrayList<PrimerakKnjige>();
        File fajl = new File(imeFajla);
        BufferedReader citaj = new BufferedReader(new FileReader(fajl));
        String line = null;
        while((line = citaj.readLine())!= null) {
            String [] niz = line.split(";");
            String id  = niz[0];
            int brStrana = Integer.parseInt(niz[1]);
            boolean tipPoveza= Boolean.parseBoolean(niz[2]);
            int godinaStampanja = Integer.parseInt(niz[3]);
            boolean jeliIznajmljena = Boolean.parseBoolean(niz[4]);
            ArrayList<Knjiga> knjiga = citajKnjige("Objektno/knjige.txt");
            Knjiga knjiga1 = null;
            for (Knjiga k: knjiga) {
                if(k.getId().equals(niz[5])) {
                    knjiga1 = k;
                }
            }
            PrimerakKnjige primerak = new PrimerakKnjige(id,brStrana,tipPoveza,godinaStampanja,jeliIznajmljena,knjiga1);
            primerakKnjige.add(primerak);    
        }
        citaj.close();
        return primerakKnjige;
    }
    public void upisiPrimerak(PrimerakKnjige p) throws IOException{
        File file = new File("Objektno/primerakKnjige.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String primerak = p.getId()+ ";"+ p.getBrStrana()+";"+p.isTipPoveza()+";"+p.getGodinaStampanja()+";"+p.isJeliIznajmljena()+";"+p.getKnjiga();
            writer.write(primerak);
            writer.newLine();
        writer.close();
    }
    public ArrayList<IzdavanjeKnjige> citajIzdavanjeKnjige(String imeFajla) throws IOException{
        ArrayList<IzdavanjeKnjige> izdavanjeknjiga = new ArrayList<IzdavanjeKnjige>();
        File fajl = new File(imeFajla);
        BufferedReader citaj = new BufferedReader(new FileReader(fajl));
        String line = null;
        while((line = citaj.readLine())!= null) {
            String [] niz = line.split(",");
            LocalDate datumIznajmljivanja = LocalDate.parse(niz[0]);
            LocalDate datumVracanja = LocalDate.parse(niz[1]);
            ArrayList<ClanBiblioteke> clanovi = citajClanove("Objektno/clanoviBiblioteke.txt");
            ClanBiblioteke clan1 = null;
            for (ClanBiblioteke t : clanovi) {
                if(t.getId().equals(niz[3])) {
                    clan1 = t;
                }
            }
            ArrayList<Bibliotekar> bibliotekari = citajBibliotekara("Objektno/bibliotekar.txt");
            Zaposleni zaposleni = null;
            for (Bibliotekar t : bibliotekari) {
                if(t.getId().equals(niz[2])) {
                    zaposleni = t;
                }
            }
            if(zaposleni == null) { 
                ArrayList<Administrator> administartor = citajAdministratora("Objektno/administrator.txt");
                for (Administrator t : administartor) {
                    if(t.getId().equals(niz[2])) {
                        zaposleni = t;
                    }
                }
            }
            ArrayList<PrimerakKnjige> primerciKnjige = citajPrimerke("Objketno/primerakKnjige.txt");
            PrimerakKnjige primerKnjige = null;
            for (PrimerakKnjige t : primerciKnjige) {
                if(t.getId().equals(niz[4])) {
                    primerKnjige = t;
                }
            }
            IzdavanjeKnjige izdavanje = new IzdavanjeKnjige(datumIznajmljivanja,datumVracanja,zaposleni,clan1,primerKnjige);
            izdavanjeknjiga.add(izdavanje);
        }
        citaj.close();
        return izdavanjeknjiga;

    }
    public void upisiIzdavanjeKnjige(IzdavanjeKnjige t) throws IOException{
        File file = new File("Objektno/izdavanjeKnjige.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String izdavanje = t.getDatumIznajmljivanja()+ ";"+ t.getDatumVracanja()+ ";"+t.getZaposleni()+ ";"+ t.getClan()+ ";"+ t.getPrimerak();
            writer.write(izdavanje);
            writer.newLine();;
        writer.close();
    }
	
	

}


