package com.twitter.poruke;

/**
 * Klasa sadrzi atribute korisnik i poruka, odgovarajuce get i set metode za ove atribute i metodu toString
 * @author djurdja
 *
 */

public class TwitterPoruka {
	/**
	 * Atribut korisnik je tipa String
	 */
	private String korisnik;
	/**
	 * Atribut poruka je tipa String
	 */
	private String poruka;
	/**
	 * Metoda vraca vrednost atributa korisnik
	 * @return
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * Metoda na osnovu unetog parametra postavlja vrednost atributa korisnik na unetu vrednost.
	 * Uneta vrednost ne sme biti nula ili prazan string.
	 * @param korisnik
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.equals(""))
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * Metoda vraca vrednost atributa poruka
	 * @return
	 */
	public String getPoruka() {
	return poruka;
	}
	/**
	 * Metoda na osnovu unetog parametra postavlja vrednost atributa poruka na unetu vrednost.
	 * Uneta vrednost ne sme biti nula ili string duzi od 140 karaktera.
	 * @param poruka
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * Metoda vraca String koji sadrzi korisnika i poruku
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}

}
