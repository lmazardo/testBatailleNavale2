import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatailleNavaleTest {

    @Test
    public void couldCreateBatailleNavale() {
        BatailleNavale batailleNavale = new BatailleNavale();

        assertEquals(false, batailleNavale.hasWin());

    }

    @Test
    public void shootAndwin() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.shoot();

        assertEquals(true, batailleNavale.hasWin());

    }

    @Test
    public void shootIntTheBoat() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.shoot(3);

        assertEquals(true, batailleNavale.hasWin());
    }

}
