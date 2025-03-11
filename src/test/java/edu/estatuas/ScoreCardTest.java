package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class ScoreCardTest {

    @Test
    public void testConstructor() {
        // Arrange
        String expectedColor = "Rojo";

        // Act
        ScoreCard scoreCard = new ScoreCard(expectedColor);


        assertEquals("El color de la tarjeta debería ser 'Rojo'", expectedColor, scoreCard.getColor());
    }
}