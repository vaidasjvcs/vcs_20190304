package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndrejTest {
    Andrej testObj = new Andrej();

    @Test
    public void AndrejPlusName() {
        String text = testObj.theMethod("Santa");

        assertEquals("Hello, Santa, I am Andrej, it is nice to meet you!", text);
    }
}
