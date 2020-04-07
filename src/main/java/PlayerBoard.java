public class PlayerBoard {
    String[][] board;

    public PlayerBoard(int boardSize) {
        board = new String[boardSize][boardSize];
    }

    String formattedBoard() {
        StringBuilder boardString = new StringBuilder();

        boardString.append("  0123456789\n");
        for (int i = 0; i < board.length; i++) {
            boardString.append(i + "|");
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    boardString.append(" ");
                } else {
                    boardString.append(board[i][j]);
                }
            }
            boardString.append("|" + i + "\n");
        }
        boardString.append("  0123456789\n");

        return boardString.toString();
    }

    void deployBoats(int[][] boatPositions) {
        for (int i = 0; i < 5; i++) {
            board[boatPositions[i][0]][boatPositions[i][1]] = "@";
        }
    }
}
