package designpatterns.creational.abstractfactory.product.sofa;

public class VictorianSofa implements Sofa{
    @Override
    public void doSit() {
        System.out.println("sitting on victorian sofa");
    }
}
