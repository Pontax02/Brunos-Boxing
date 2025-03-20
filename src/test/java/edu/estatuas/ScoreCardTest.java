package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class ScoreCardTest {

    private static ScoreCard sc;
    private String[] whiteScoreCard =  {"9 - 10",
            "9 - 10",
            "9 - 10",
            "9 - 10",
            "10 - 9",
            "10 - 9",
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "9 - 10"};

    private String[] pinkScoreCard = {"9 - 10",
            "9 - 10",
            "9 - 10",
            "1, 8 - 10",
            "10 - 8",
            "10 - 8 ,1",
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "10 - 8"};

    @BeforeClass
    public static void setup() {
        sc = new ScoreCard("white");
    }

    @Test
    public void checkColorTest() {

        assertEquals("white", sc.getColor());
    }
    @Test
    public void checkCornerTest() {

        assertEquals("Rocky Balboa",sc.getRcorner());
        assertEquals("Apollo Creed",sc.getBcorner());


    }
}