package come.twu.gameOfLife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void testToCheckSumOfRow() {
        Grid grid=new Grid();

        int actualArray[] = new int[] {3,3,3};

        int expectedSum=grid.computeRowSum();

        assertEquals(9, expectedSum);
    }



}