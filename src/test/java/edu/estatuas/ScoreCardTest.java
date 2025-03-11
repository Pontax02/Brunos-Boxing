package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class ScoreCardTest {

    private static ScoreCard sc;

    @BeforeClass
    public static void setup() {
        sc = new ScoreCard("white","","");
    }

    @Test
    public void checkColorTest() {

        assertEquals("white", sc.getColor());
    }
}