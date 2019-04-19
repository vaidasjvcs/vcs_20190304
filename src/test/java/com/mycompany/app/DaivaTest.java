package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DaivaTest {

    Daiva daiva = new Daiva();

    @Test
    public void testSayLabas(){
        assertEquals("Hello Julia Roberts, I am Daiva, it is nice to meet you!", daiva.sayLabas("Julia Roberts"));
    }
}
