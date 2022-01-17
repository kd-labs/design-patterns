package designpatterns.creational.abstractfactory.product.table;

public class ModernTable implements Table {
    @Override
    public void doPut() {
        System.out.println("putting things on modern table");
    }
}
