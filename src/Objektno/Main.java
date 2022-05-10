package Objektno;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Biblioteka biblio = new Biblioteka("mica tosic","svetosavska","+3810645098924",LocalDate.parse("2004-05-11"),LocalDate.parse("2007-07-02"),"1");
//		Administrator admin = new Administrator("4","Rade","Radic","1702962710034","VojvodeStepe",EnumPol.MUSKI,"Rade123","RRade"); 
		Bibliotekar bibliotekar = new Bibliotekar("9","Sonja","Sokic","0109979710035","KolubarskiTrg",EnumPol.ZENSKI,"Sonjica333","SonjaSonic"); 
//		biblio.upisiFajlAdministartor(admin);
		biblio.upisiFajlBibliotekar(bibliotekar);
	}

}
