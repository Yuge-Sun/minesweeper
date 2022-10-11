public class board {
    //3x3 board
    //1 2 3
    //4 5 6
    //7 8 9
    boolean[][] bomb = {{false, false, true}, {false, true, false}, {true, false, false}};
    boolean[][] land01 = new boolean[3][3];

    public void initialiseBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.land01[i][j] = false;
            }
        }
    }

    public boolean printBoard(int i, int j) {
        return land01[i][j];
    }
}