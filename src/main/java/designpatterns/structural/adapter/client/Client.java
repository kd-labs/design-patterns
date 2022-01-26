package designpatterns.structural.adapter.client;

import designpatterns.structural.adapter.adaptee.SquarePeg;
import designpatterns.structural.adapter.adapter.SquarePegAdapter;
import designpatterns.structural.adapter.client.clientinterface.IRoundPeg;
import designpatterns.structural.adapter.client.clientinterface.RoundPegs;

public class Client {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);

        IRoundPeg roundPegs = new RoundPegs(4);

        System.out.println("RoundPeg fits in RoundHole : " + roundHole.fits(roundPegs));

        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("SquarePeg fits in RoundHole : " + roundHole.fits(squarePegAdapter));


    }
}
