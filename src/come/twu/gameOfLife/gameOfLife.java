package come.twu.gameOfLife;

public class GameOfLife {
    int[][] cell = new int[3][];

    GameOfLife() {
        for(int iteratorForRow=0;iteratorForRow<3;iteratorForRow++) {
            cell[iteratorForRow] = new int[3];
            for (int iteratorForColumn = 0; iteratorForColumn < 3; iteratorForColumn++) {
                cell[iteratorForRow][iteratorForColumn] = 0;
            }
        }
    }
    public int sumOfRows() {
        return 0;
    }
}
