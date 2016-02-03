import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.fail;

public class BatailleNavale {

    public boolean hasWin() {
        return hasWin;
    }

    public void shoot(int pos) {
        shoots.add(pos);
        if(shoots.contains(3) && shoots.contains(5))
            hasWin = true;
        numTries++;
    }

    public int getNumTries() {
        return numTries;
    }

    void run() {
        while (!hasWin()) {
            int pos = getInput();
            shoot(pos);

            if (MAX_TRY == getNumTries()) {
                fail();
            }
            System.out.println("shoot");
        }
    }

    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        //return new Random().nextInt(4);
        return scanner.nextInt();
    }

    public boolean hasLoose() {
        if (numTries == MAX_TRY + 1) {
            return true;
        }
        return false;
    }


    public static final int MAX_TRY = 10;

    private boolean hasWin;
    private int numTries;

    ArrayList shoots = new ArrayList<Integer>(100);
}
