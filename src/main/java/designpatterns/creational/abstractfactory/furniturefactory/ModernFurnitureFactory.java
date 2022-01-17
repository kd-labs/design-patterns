package designpatterns.creational.abstractfactory.furniturefactory;

import designpatterns.creational.abstractfactory.product.chair.Chair;
import designpatterns.creational.abstractfactory.product.chair.ModernChair;
import designpatterns.creational.abstractfactory.product.sofa.ModernSofa;
import designpatterns.creational.abstractfactory.product.sofa.Sofa;
import designpatterns.creational.abstractfactory.product.table.ModernTable;
import designpatterns.creational.abstractfactory.product.table.Table;

public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
