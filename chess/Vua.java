package chess;

public class Vua extends QuanCo {
    public Vua(int x, int y) {
        super(x, y);
    }

    ///////
    // * * * * * * * *
    // * * * * * * * *
    // * * * * # * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * * * * * * *

    // Vua: x, y   -> (x, y-1);  (x, y+1);  (x+1, y); (x-1, y)); (x+1, y+1); (x-1, y-1); (x+1, y-1); (x-1, y+1)

    @Override
    public boolean canMoveTo(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7) return false;
        if (this.x == x && this.y == y) return false;
        if (Math.abs(this.x - x) <= 1 && Math.abs(this.y - y) <= 1) return true;
        return false;
    }

    @Override
    public void moveTo(int x, int y) {
        if (canMoveTo(x, y)) {
            this.x = x;
            this.y = y;
        }
    }
}
