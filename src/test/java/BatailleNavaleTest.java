import org.junit.Test;

import static org.junit.Assert.*;

public class BatailleNavaleTest {

    @Test
    public void couldCreateBatailleNavale() {
        BatailleNavale batailleNavale = new BatailleNavale();

        assertEquals(false, batailleNavale.hasLoose());
        assertEquals(false, batailleNavale.hasWin());
        assertEquals(0, batailleNavale.getNumTries());

    }

    @Test
    public void shootInTheBoat() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.shoot(3);

        assertEquals(false, batailleNavale.hasWin());
    }

    @Test
    public void whenShootingIncreasingNumTries() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.shoot(0);

        assertNotEquals(0, batailleNavale.getNumTries());

    }

    @Test
    public void shootTenTimesInTheWater() {
        BatailleNavale batailleNavale = new BatailleNavale();

        for(int i=0; i < batailleNavale.MAX_TRY + 1 ; i++) {
            batailleNavale.shoot(0);
        }

        assertEquals(true, batailleNavale.hasLoose());

    }

    @Test
    public void shootTwoBoatsAndWin() {
        BatailleNavale batailleNavale = new BatailleNavale();

        batailleNavale.shoot(3);
        batailleNavale.shoot(5);

        assertEquals(true, batailleNavale.hasWin());
    }
}
