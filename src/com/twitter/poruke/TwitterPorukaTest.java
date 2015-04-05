/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author djurdja
 *
 */
public class TwitterPorukaTest {
	
	private TwitterPoruka twitterPoruka;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		twitterPoruka = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		twitterPoruka = null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnik() {
		twitterPoruka.setKorisnik(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnik2(){
		twitterPoruka.setKorisnik("");
		
	}
	
	@Test
	public void testSetKorisnik3(){
		
		twitterPoruka.setKorisnik("Pera");
		String real = twitterPoruka.getKorisnik();
		assertEquals("Pera", real);
		
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		twitterPoruka.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka2(){
		twitterPoruka.setPoruka(".................................................................................................................................................................");
	
	}
	
	@Test
	public void testSetPoruka3(){
		twitterPoruka.setPoruka("Ovo je poruka");
		assertEquals("Ovo je poruka", twitterPoruka.getPoruka());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		twitterPoruka.setKorisnik("Pera");
		twitterPoruka.setPoruka("Ovo je poruka");
		assertEquals("KORISNIK:Pera PORUKA:Ovo je poruka", twitterPoruka.toString());
	}

}
