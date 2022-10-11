import java.util.Random;

public class board {

    boolean[][] bomb = {{false, false, true}, {false, true, false}, {true, false, false}};

    boolean[][] bombGrid = new boolean[11][11]; //bomb
    String [][] UIGrid = new String[11][11];
    int[][] adjacentNum = new int [11][11];

    public void initialiseBoard() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                this.bombGrid[i][j] = false;
                this.UIGrid[i][j] = "◻";
            }
        }
    }
    public String printLand(int i, int j) {
        return UIGrid[i][j];
    }

    public void printBoard() {
        for (int i = 0; i < 10; i++){
            if (i==0){
                System.out.print("\n\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
            }
            else{
                for (int j = 0; j < 10; j++) {
                    if (j == 0) {
                        System.out.print(i + "\t");
                    }
                    else {
                        System.out.print(printLand(i,j)+"\t");
                    }
                    if (j == 9) {
                        System.out.print("\n");
                    }
                }
            }
        }
    }

    public void fillBoard(int a, int b) {
        int numOfBombs = 0;
        while (numOfBombs <10) {
           for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if (i != a && i != b && bombGrid[i][j] != true) {
                        Random rand = new Random();
                        int n = rand.nextInt(100);
                        if (n == 1 && numOfBombs != 10) {
                            bombGrid[i][j] = true;
                            numOfBombs++;
                        }
                    }
                }
            }
        }
    }
    public void showBombs () {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (bombGrid[i][j] == true) {
                    UIGrid[i][j] = "B";
                }
            }
        }
    }

    public void calcAdjacentNum () {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {


            }
        }
    }




}