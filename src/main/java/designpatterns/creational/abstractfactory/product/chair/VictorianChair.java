package designpatterns.creational.abstractfactory.product.chair;

public class VictorianChair implements Chair {
    @Override
    public void doSit() {
        System.out.println("sitting on victorian chair");
    }
}
