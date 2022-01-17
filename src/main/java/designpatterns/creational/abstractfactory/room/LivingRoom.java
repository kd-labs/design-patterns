package designpatterns.creational.abstractfactory.room;

import designpatterns.creational.abstractfactory.furniturefactory.FurnitureFactory;
import designpatterns.creational.abstractfactory.product.chair.Chair;
import designpatterns.creational.abstractfactory.product.sofa.Sofa;
import designpatterns.creational.abstractfactory.product.table.Table;

public class LivingRoom {

    private Chair chair;
    private Sofa sofa;
    private Table table;

    public LivingRoom(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }

    public void buildRoom() {
        chair.doSit();
        sofa.doSit();
        table.doPut();
    }
}
