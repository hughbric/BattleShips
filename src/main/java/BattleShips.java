import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {
        System.out.println("**** Welcome to Battle Ships game ****\n");
        System.out.println("Right now, the ocean is empty.\n");

        PlayerBoard playerBoard = new PlayerBoard(10);
        System.out.println(playerBoard.formattedBoard());

        PlayerBoats playerBoats = new PlayerBoats(5);
        playerBoats.setPositions(getBoatPositions());

        playerBoard.deployBoats(playerBoats.positions);
        System.out.println(playerBoard.formattedBoard());
    }

    static int[][] getBoatPositions() {
        Scanner input = new Scanner(System.in);
        int[][] boatPositions = new int[5][2];
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
