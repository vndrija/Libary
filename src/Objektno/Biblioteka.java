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
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));

			String sb = b.getId() +";"+ b.getIme() + ";"+b.getPrezime()+ ";"+b.getJMBG() +";"+ b.getAdresa()+ ";" +b.getPol() +";"+b.getKorisnickaSifra()+";"+b.getKorisnickoIme();
			writer.write(sb);
			writer.newLine();

		writer.close();
	}
	

	
}


