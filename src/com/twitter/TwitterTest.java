package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	
	public LinkedList<TwitterPoruka> poruke;

	@Before
	public void setUp() throws Exception {
		poruke = new LinkedList<TwitterPoruka>();
	}

	@After
	public void tearDown() throws Exception {
		poruke = null;
	}

	@Test
	public void testUnesi() {
		TwitterPoruka tp = new TwitterPoruka();
		String korisnik = "Pera";
		String poruka = "Ovo je poruka";
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		poruke.add(tp);
		assertEquals("Pera", tp.getKorisnik());
		assertEquals("Ovo je poruka", tp.getPoruka());
		
	}

	@Test
	public void testVratiPoruke() {
		int maxBroj = 5;
		String tag = "poruka";
		TwitterPoruka tp = new TwitterPoruka();
		String korisnik = "Pera";
		String poruka = "Ovo je poruka";
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		poruke.add(tp);
		
		
		TwitterPoruka tp1 = new TwitterPoruka();
		String korisnik1 = "Mika";
		String poruka1 = "Ovo je poruka";
		tp1.setKorisnik(korisnik1);
		tp1.setPoruka(poruka1);
		poruke.add(tp1);
		
		int brojac = 0;
		
		TwitterPoruka[] pom = new TwitterPoruka[maxBroj];
		pom[0]=tp;
		pom[1]=tp1;
		
 		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
 		for (int i = 0; i < poruke.size(); i++)
 			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
 				if (brojac < maxBroj){
 					rezultat[brojac+1]=poruke.get(i);
 					brojac++;
 				}
 				else break;
 		assertEquals(pom[0], rezultat[1]);
 		assertEquals(pom[1], rezultat[2]);
		
		
	}

}
