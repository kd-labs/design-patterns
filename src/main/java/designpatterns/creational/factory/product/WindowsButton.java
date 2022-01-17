package designpatterns.creational.factory.product;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicked on windows button");
    }
}
