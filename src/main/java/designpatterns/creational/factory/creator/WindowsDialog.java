package designpatterns.creational.factory.creator;

import designpatterns.creational.factory.product.Button;
import designpatterns.creational.factory.product.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
