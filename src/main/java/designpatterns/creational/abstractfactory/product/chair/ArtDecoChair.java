package designpatterns.creational.abstractfactory.product.chair;

public class ArtDecoChair implements Chair{

    @Override
    public void doSit() {
        System.out.println("sitting on art deco chair");
    }
}
