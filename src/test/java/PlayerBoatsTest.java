import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlayerBoatsTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    PlayerBoats playerBoats;

    @Before
    public void setUp() {
        playerBoats =  new PlayerBoats(5);
    }

    @Test
    public void testConstructor() {
        assertEquals(5, playerBoats.positions.length);
    }

    @Test
    public void testSettingPositions() {
        int[][] positions = { {1,1}, {1,2}, {2,2}, {3,3}, {4,4} };
        playerBoats.setPositions(positions);
        assertEquals("[[1, 1], [1, 2], [2, 2], [3, 3], [4, 4]]", Arrays.deepToString(playerBoats.positions));
    }
}
