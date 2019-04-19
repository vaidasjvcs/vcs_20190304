package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test_respondCheck()
    {
    	TomasT testing = new TomasT();
    	String answer = testing.respond("Andrew");
    	assertEquals("Hello, Andrew, I am Tomas, it's nice to meet you!", answer);
    }
}
