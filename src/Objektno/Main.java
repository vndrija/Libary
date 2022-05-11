package Objektno;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Biblioteka biblio = new Biblioteka("mica tosic","svetosavska","+3810645098924",LocalDate.parse("2004-05-11"),LocalDate.parse("2007-07-02"),"1");
//		Administrator admin = new Administrator("4","Rade","Radic","1702962710034","VojvodeStepe",EnumPol.MUSKI,"Rade123","RRade"); 
//		Bibliotekar bibliotekar = new Bibliotekar("9","Sonja","Sokic","0109979710035","KolubarskiTrg",EnumPol.ZENSKI,"Sonjica333","SonjaSonic"); 
//		biblio.upisiFajlAdministartor(admin);
//		biblio.upisiFajlBibliotekar(bibliotekar);
//		ZanrKnjige zanr = new ZanrKnjige("BLabla","isto blabla","3");
//		Knjiga knjiga = new Knjiga("69","50 nijansi sive","Le 50 nijanos of grayus","Pera Peric",2011,Jezik.ENGLESKI,"Zanimljiva ljubavna prica",zanr);
//		biblio.upisiKnjigu(knjiga);
		TipClanarine clanarina = new TipClanarine("99","Odrasli",499.99);
//		biblio.upisiTipClanarine(clanarina);
		ClanBiblioteke clan = new ClanBiblioteke("44","Mirko","Mirkovic","8984573097","Vojvodjanska",EnumPol.MUSKI,"024",LocalDate.parse("2020-03-09"),12,true,clanarina);
		biblio.upisiClanaBiblioteke(clan);
	}

}
