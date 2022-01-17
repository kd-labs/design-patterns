package designpatterns.creational.abstractfactory.product.chair;

public class ModernChair implements Chair {
    @Override
    public void doSit() {
        System.out.println("sitting on modern chair");
    }
}
