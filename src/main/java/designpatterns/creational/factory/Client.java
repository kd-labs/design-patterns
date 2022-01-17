package designpatterns.creational.factory;

import designpatterns.creational.factory.creator.Dialog;
import designpatterns.creational.factory.creator.HtmlDialog;
import designpatterns.creational.factory.creator.WindowsDialog;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {

        configure(args[0]);
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.render();
    }

    private static void configure(String arg) {

        if (arg.equalsIgnoreCase("html")) {
            dialog = new HtmlDialog();
        } else {
            dialog = new WindowsDialog();
        }

    }
}
