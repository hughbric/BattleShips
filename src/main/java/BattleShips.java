import java.util.Scanner;

public class BattleShips {
    private static int boardSize = 10;
    private static int boatQuantity = 5;

    public static void main(String[] args) {
        System.out.println("**** Welcome to Battle Ships game ****\n");
        System.out.println("Right now, the ocean is empty.\n");

        PlayerBoard playerBoard = new PlayerBoard(boardSize, boatQuantity);
        System.out.println(playerBoard.formattedBoard());

        playerBoard.setBoatPositions(getBoatPositions());

        System.out.println(playerBoard.formattedBoard());
    }

    static int[][] getBoatPositions() {
        Scanner input = new Scanner(System.in);
        int[][] boatPositions = new int[boatQuantity][2];
        System.out.println("Deploy your ships:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter X coordinate for your ship: ");
            boatPositions[i][0] = input.nextInt();
            System.out.println("Enter Y coordinate for your ship: ");
            boatPositions[i][1] = input.nextInt();
        }
        return boatPositions;
    }
}
