package designpatterns.creational.factory.creator;

import designpatterns.creational.factory.product.Button;

public abstract class Dialog {

    public void render(){
        System.out.println("Rendering diaglog box");
        Button button = createButton();
        button.render();
    }

    // abstract factory method
    public abstract Button createButton();
}
