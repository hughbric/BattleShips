import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class PlayerBoardTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    PlayerBoard playerBoard;

    @Before
    public void setUp() {
        playerBoard =  new PlayerBoard(10, 5);
    }

    @Test
    public void testFormattedBoard() {
        assertEquals(
                "  0123456789\n" +
                        "0|          |0\n" +
                        "1|          |1\n" +
                        "2|          |2\n" +
                        "3|          |3\n" +
                        "4|          |4\n" +
                        "5|          |5\n" +
                        "6|          |6\n" +
                        "7|          |7\n" +
                        "8|          |8\n" +
                        "9|          |9\n" +
                        "  0123456789\n",
                playerBoard.formattedBoard()
        );
    }

    @Test
    public void testSetBoatPositions() {
        int[][] positions = { {1,1}, {1,2}, {2,2}, {3,3}, {4,4} };
        playerBoard.setBoatPositions(positions);

        assertEquals(
                "  0123456789\n" +
                        "0|          |0\n" +
                        "1| @@       |1\n" +
                        "2|  @       |2\n" +
                        "3|   @      |3\n" +
                        "4|    @     |4\n" +
                        "5|          |5\n" +
                        "6|          |6\n" +
                        "7|          |7\n" +
                        "8|          |8\n" +
                        "9|          |9\n" +
                        "  0123456789\n",
                playerBoard.formattedBoard()
        );
    }
}
