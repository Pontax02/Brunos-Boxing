package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class ScoreCardTest {

    private static ScoreCard card;
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
        card = new ScoreCard("white");
    }






    @Test
    public void loadJudgeScoreCardRoundFactoryNullTest() {
        card.loadJudgeScoreCard(new String[]{null, null});
        assertEquals(10, card.getNumRounds());
    }

    @Test
    public void loadJudgeScoreCardRoundFactoryPointsDeductedTest() {

        card.loadJudgeScoreCard(pinkScoreCard);
        assertEquals(10, card.getNumRounds());
        assertEquals(2, card.getRounds().stream().filter(a -> a instanceof PointsDeducted).count());
    }


    @Test
    public void loadJudgeScoreCardRoundFactoryKnockDownTest() {

        card.loadJudgeScoreCard(pinkScoreCard);
        assertEquals(20, card.getNumRounds());
        assertEquals(4, card.getRounds().stream().filter(a -> a instanceof KnockdownRound).count());
    }


}