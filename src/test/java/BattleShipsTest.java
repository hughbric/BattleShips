import org.junit.*;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BattleShipsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testDrawsBoard() {
        BattleShips.DrawBoard();
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
                outContent.toString());
    }

    @Test
    public void testShipsGetDeployedOnBoard() {
        String[][] board = new String[10][10];
        Integer[][] boats = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}};

        BattleShips.DeployShips(board, boats);

        assertEquals(board[0][0], "@");
        assertEquals(board[1][1], "@");
        assertEquals(board[2][2], "@");
        assertEquals(board[3][3], "@");
        assertEquals(board[4][4], "@");
    }
}
