package designpatterns.structural.adapter.client;

import designpatterns.structural.adapter.client.clientinterface.IRoundPeg;

public class RoundHole {

    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(IRoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
