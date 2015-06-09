package come.twu.gameOfLife;

public class Grid {

    int[][] grid = new int[3][];

    Grid() {
        for (int iteratorForRow = 0; iteratorForRow < 3; iteratorForRow++) {
            grid[iteratorForRow] = new int[3];
            for (int iteratorForColumn = 0; iteratorForColumn < 3; iteratorForColumn++) {
                grid[iteratorForRow][iteratorForColumn] = 1;

            }
        }
    }

    public int computeRowSum() {
        int sumArray[] = new int[3];

        for (int rowNo = 0; rowNo < 3; rowNo++)
            for (int colNo = 0; colNo < 3; colNo++)
                sumArray[rowNo] += grid[rowNo][colNo];
        int rowSum = sumArray[0] + sumArray[1] + sumArray[2];
        return rowSum;
    }
}
