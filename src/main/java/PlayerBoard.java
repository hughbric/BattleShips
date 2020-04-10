public class PlayerBoard {
    private String[][] board;
    private int[][] boatPositions;

    public PlayerBoard(int boardSize, int boatQuantity) {
        board = new String[boardSize][boardSize];
        boatPositions = new int[boatQuantity][2];
    }

    public String formattedBoard() {
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

    public void setBoatPositions(int[][] positions){
        for(int i =0; i < boatPositions.length; i++) {
            boatPositions[i] = positions[i];
            board[positions[i][0]][positions[i][1]] = "@";
        }
    }
}
