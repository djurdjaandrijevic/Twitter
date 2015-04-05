/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author djurdja
 *
 */
public class TwitterTest {

	private LinkedList<TwitterPoruka> poruke;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		 poruke = new LinkedList<TwitterPoruka>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		poruke=null;
	}

	@Test
	public void testUnesi() {
		TwitterPoruka tp = new TwitterPoruka();
		String korisnik = "Pera";
		String poruka = "Ovo je poruka";
		tp.setKorisnik("korisnik");
		tp.setPoruka(poruka);
		poruke.add(tp);
		assertEquals("Pera", tp.getKorisnik());
		assertEquals("Ovo je poruka", tp.getPoruka());
	}
	
	@Test
	public void testVratiPoruke(){
		int brojac = 0;
		int maxBroj = 5;
		String tag = "poruka";
		
		//TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		String korisnik = "Pera";
		String poruka = "Ovo je poruka";
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		poruke.add(tp);
		
		
		for (int i = 0; i < poruke.size(); i++)
 			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
 				if (brojac < maxBroj){
 					rezultat[brojac+1]=poruke.get(i);
 					brojac++;
 				}
 				else break;
		
		
	assertEquals("KORISNIK:Pera PORUKA:Ovo je poruka",rezultat);
	}

}
