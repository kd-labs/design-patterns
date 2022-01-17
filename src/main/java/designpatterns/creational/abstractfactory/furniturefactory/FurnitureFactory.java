package designpatterns.creational.abstractfactory.furniturefactory;

import designpatterns.creational.abstractfactory.product.chair.Chair;
import designpatterns.creational.abstractfactory.product.sofa.Sofa;
import designpatterns.creational.abstractfactory.product.table.Table;

public abstract class FurnitureFactory {

    // abstract factory method to create chair product
    public abstract Chair createChair();

    // abstract factory method to create sofa product
    public abstract Sofa createSofa();

    // abstract factory method to create table product
    public abstract Table createTable();

}
