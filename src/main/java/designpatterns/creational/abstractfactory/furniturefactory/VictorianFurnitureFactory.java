package designpatterns.creational.abstractfactory.furniturefactory;

import designpatterns.creational.abstractfactory.product.chair.Chair;
import designpatterns.creational.abstractfactory.product.chair.VictorianChair;
import designpatterns.creational.abstractfactory.product.sofa.Sofa;
import designpatterns.creational.abstractfactory.product.sofa.VictorianSofa;
import designpatterns.creational.abstractfactory.product.table.Table;
import designpatterns.creational.abstractfactory.product.table.VictorianTable;

public class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
