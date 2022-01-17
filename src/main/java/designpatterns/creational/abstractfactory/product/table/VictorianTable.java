package designpatterns.creational.abstractfactory.product.table;

public class VictorianTable implements Table {
    @Override
    public void doPut() {
        System.out.println("putting things on victorian table");
    }
}
