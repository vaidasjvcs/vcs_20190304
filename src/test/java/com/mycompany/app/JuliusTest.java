package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JuliusTest {
	
	@Test
	public void test_methodName() {
		// setup
		Julius text = new Julius();
		

		// test
		String rez = text.methodName("Tadas");

		// assertion
		assertEquals("Hello,Tadas, I am Julius, it is nice to meet you!", rez);
	}

}
