package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
import edu.estatuas.ScoreCard;
public class ScoreCardTest {

    private static ScoreCard card;

    @BeforeClass
    public static void setUpBefore() {
        card = new ScoreCard("rojo");
    }

    @Test
    public void checkColorTest() {
        String color = "rojo";
        assertEquals(color, card.getColor());
    }
}