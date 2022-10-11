public class Main {
    public static void main(String[] args) {
        board board01 = new board();
        board01.initialiseBoard();
        board01.printBoard();
        board01.fillBoard(5, 5);
        board01.showBombs ();
        board01.printBoard();

    }
}