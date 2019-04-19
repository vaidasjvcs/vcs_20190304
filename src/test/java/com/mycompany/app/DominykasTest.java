package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class DominykasTest {
	
	@Test
	public void testmethod() {
		Dominykas Test = new Dominykas();
		String replay = Test.method("Robertas", "Domas");
		assertEquals("Hello, Robertas, I am Domas, it is nice to meet you", replay);
	}
}
