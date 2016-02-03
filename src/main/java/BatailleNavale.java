public class BatailleNavale {

    public boolean hasWin() {
        return hasWin;
    }

    public void shoot() {
        hasWin = true;
    }

    public void shoot(int pos) {
        hasWin = pos == 3 ;
    }

    private boolean hasWin;
}
