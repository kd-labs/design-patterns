package designpatterns.creational.builder;

import designpatterns.creational.builder.builder.Builder;
import designpatterns.creational.builder.impls.CarBuilder;
import designpatterns.creational.builder.impls.ManualBuilder;
import designpatterns.creational.builder.product.Car;
import designpatterns.creational.builder.product.Manual;

public class Client {

    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();

        Director director = new Director();
        director.buildSportsCar(carBuilder);
        Car sportsCar = carBuilder.getResult();

        System.out.println(sportsCar);

        ManualBuilder manualBuilder = new ManualBuilder();

        director.buildSportsCarManual(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual);

    }
}
