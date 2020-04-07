public class PlayerBoats {
    int[][] positions;

    public PlayerBoats(int boatQuantity) {
        positions = new int[boatQuantity][2];
    }

    public void setPositions(int[][] boatPositions){
        for(int i =0; i < boatPositions.length; i++) {
            positions[i] = boatPositions[i];
        }
    }
}
