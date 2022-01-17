package designpatterns.creational.abstractfactory.product.sofa;

public class ArtDecoSofa implements Sofa {

    @Override
    public void doSit() {
        System.out.println("Sitting on art deco sofa");
    }
}
