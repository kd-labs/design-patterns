package designpatterns.creational.abstractfactory.product.sofa;

public class ModernSofa implements Sofa {
    @Override
    public void doSit() {
        System.out.println("sitting on modern sofa");
    }
}
