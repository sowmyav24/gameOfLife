package come.twu.gameOfLife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {

    @Test
    public void testToCheckIfStateZeroIsInitialzed() {
        GameOfLife game = new GameOfLife();

        int actualSum = 0;

        assertEquals(actualSum, game.sumOfRows());
    }
}