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
    public void testInitialisesGameBoard() {
        BattleShips.main(new String[] {});
        assertEquals(
                "**** Welcome to Battle Ships game ****\n" +
                        "\n" +
                        "Right now, the ocean is empty.\n" +
                        "\n" +
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
}
