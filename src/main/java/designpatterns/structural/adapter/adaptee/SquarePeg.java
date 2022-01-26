package designpatterns.structural.adapter.adaptee;

public class SquarePeg {

    private int side;

    public SquarePeg(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
