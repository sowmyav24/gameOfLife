package come.twu.gameOfLife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class gameOfLifeTest {

    @Test
    public void testToCheckIfStateZeroIsInitialzed() {
        gameOfLife game = new gameOfLife();

        int actualSum = 0;

        assertEquals(0, game.sumOfRows());
    }
}