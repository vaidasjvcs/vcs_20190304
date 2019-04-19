package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VytautasTest {

	@Test
	public void test_pasisveikinimas() {
		// setup
		Vytautas vardas = new Vytautas();
		
		// test
		String reply = vardas.pasisveikinimas();
		
		// assertion patikrinimas
		assertEquals("Hello, Julia Roberts, I am Vytautas, it is nice to meet you!", reply);
		
	}
}
