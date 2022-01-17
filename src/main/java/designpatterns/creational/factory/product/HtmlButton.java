package designpatterns.creational.factory.product;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering html button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Clicked on html button");
    }
}
