public class BattleShips {
    static String[][] board = new String[10][10];
    public static void main(String[] args) {
        System.out.println("**** Welcome to Battle Ships game ****\n");
        System.out.println("Right now, the ocean is empty.\n");
        DrawBoard();
    }

    private static void DrawBoard() {
        System.out.println("  0123456789");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println("|" + i);
        }
        System.out.println("  0123456789");
    }
}
