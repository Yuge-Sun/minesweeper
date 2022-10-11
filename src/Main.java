import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        board board01 = new board();
        board01.initialiseBoard();
        System.out.print(board01.printBoard(0,1));
    }
}