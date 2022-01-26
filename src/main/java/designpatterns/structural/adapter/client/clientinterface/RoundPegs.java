package designpatterns.structural.adapter.client.clientinterface;

public class RoundPegs implements IRoundPeg{

    private int radius;

    public RoundPegs(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
