package chess;

public abstract class QuanCo {
    protected int x, y;

    public QuanCo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean canMoveTo(int x, int y);
    public abstract void moveTo(int x, int y);
}
