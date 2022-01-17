package designpatterns.creational.abstractfactory.furniturefactory;

import designpatterns.creational.abstractfactory.product.chair.ArtDecoChair;
import designpatterns.creational.abstractfactory.product.chair.Chair;
import designpatterns.creational.abstractfactory.product.sofa.ArtDecoSofa;
import designpatterns.creational.abstractfactory.product.sofa.Sofa;
import designpatterns.creational.abstractfactory.product.table.ArtDecoTable;
import designpatterns.creational.abstractfactory.product.table.Table;

public class ArtDecoFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
