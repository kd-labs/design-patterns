package designpatterns.creational.factory.creator;

import designpatterns.creational.factory.product.Button;
import designpatterns.creational.factory.product.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
