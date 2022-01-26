package designpatterns.structural.adapter.adapter;

import designpatterns.structural.adapter.adaptee.SquarePeg;
import designpatterns.structural.adapter.client.clientinterface.IRoundPeg;

public class SquarePegAdapter implements IRoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) (squarePeg.getSide()/Math.sqrt(2));
    }
}
