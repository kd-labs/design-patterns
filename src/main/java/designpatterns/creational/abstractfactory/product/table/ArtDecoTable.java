package designpatterns.creational.abstractfactory.product.table;

public class ArtDecoTable implements Table {
    @Override
    public void doPut() {
        System.out.println("Putting things on art deco table");
    }
}
