import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BattleShipsTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testGameInitialises() {
        assertEquals(0, new BattleShips());
    }
}
