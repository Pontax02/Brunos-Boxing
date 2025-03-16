package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;



public class RegularRoundTest {

    private static RegularRound regular;

    @BeforeClass
    public static void setUpBeforeClass(){

        regular = new RegularRound("10 - 9");
    }
    @Test
    public void RegularRoundTest() {

        assertEquals(10,regular.getRedBoxerScore());
        assertEquals(9,regular.getBlueBoxerScore());

    }

}
