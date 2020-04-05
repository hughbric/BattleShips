import java.util.Scanner;

public class BattleShips {
    static String[][] playerBoard = new String[10][10];
    static Integer[][] playerBoatPositions = new Integer[5][2];

    public static void main(String[] args) {
        System.out.println("**** Welcome to Battle Ships game ****\n");
        System.out.println("Right now, the ocean is empty.\n");
        DrawBoard();
        SetBoatPositions();
        DeployShips(playerBoard, playerBoatPositions);
        DrawBoard();
    }

    static void DrawBoard() {
        System.out.println("  0123456789");
        for (int i = 0; i < playerBoard.length; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < playerBoard.length; j++) {
                if (playerBoard[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(playerBoard[i][j]);
                }
            }
            System.out.println("|" + i);
        }
        System.out.println("  0123456789");
    }

    static void SetBoatPositions() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter X coordinate for your ship: ");
            playerBoatPositions[i][0] = input.nextInt();
            System.out.println("Enter Y coordinate for your ship: ");
            playerBoatPositions[i][1] = input.nextInt();
        }
    }

    static void DeployShips(String[][] board, Integer[][] boatPositions) {
        for (int i = 0; i < 5; i++) {
            board[boatPositions[i][0]][boatPositions[i][1]] = "@";
        }
    }
}
