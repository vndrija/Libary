package biblioteka;

import java.io.IOException;

import swingMain.Login;

public class Main {
	public static String lokacijaZanr = "fajlovi/zanr.txt";
	public static String lokacijaAdmin = "fajlovi/administratori.txt";
	public static String lokacijaKnjige= "fajlovi/knjige.txt";
	public static String lokacijaPrimerak= "fajlovi/primerak.txt";
	public static String lokacijaBibliotekar = "fajlovi/bibliotekari.txt";
	public static String lokacijaClanovi = "fajlovi/clanovi.txt";
	public static String lokacijaIznajmljivanje= "fajlovi/iznajmljivanje.txt";
	public static String lokacijaBiblioteka= "fajlovi/biblioteka.txt";
	public static String lokacijaTip= "fajlovi/tip.txt";
	
	public static void main(String[] args) throws IOException {
		Biblioteka biblioteka = new Biblioteka();
		biblioteka.citajBiblioteku(lokacijaBiblioteka);
		biblioteka.citajClanarine(lokacijaTip);
		biblioteka.citajClanove(lokacijaClanovi);
		biblioteka.citajAdministratora(lokacijaAdmin);
		biblioteka.citajBibliotekare(lokacijaBibliotekar);
		biblioteka.citajZanroveIzFajla(lokacijaZanr);
		biblioteka.citajKnjige(lokacijaKnjige);
		biblioteka.citajPrimerke(lokacijaPrimerak);
		biblioteka.citajIzdavanjeKnjige(lokacijaIznajmljivanje);
		Login loginProzor= new Login(biblioteka);
		loginProzor.setVisible(true);

}

		
}
