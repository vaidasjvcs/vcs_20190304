package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MariusTest {

    @Test
    public void test_sayHello_replies() {
        //setup
        Marius marius = new Marius();

        // test
        String result = marius.niceToMeetYou("Bronius");

        // assertion
        assertEquals("Hello, Bronius, I am Marius, it is nice to meet you!", result);
    }
}
