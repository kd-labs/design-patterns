package designpatterns.creational.builder;

import designpatterns.creational.builder.builder.impls.CarBuilder;
import designpatterns.creational.builder.builder.impls.ManualBuilder;
import designpatterns.creational.builder.product.*;

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

        CarModern newCarModernInstance = CarModern.builder()
                .reset()
                .setSeats(4)
                .setEngine(new Engine(4d, 1000d))
                .setCarType(CarType.CITY_CAR)
                .setTransmission(Transmission.MANUAL)
                .setGpsNavigator(new GPSNavigator())
                .build();

        CarModern build = CarModern.builder()
                .reset()
                .setSeats(4)
                .setEngine(new Engine(3000d, 1000d))
                .setCarType(CarType.SPORTS_CAR)
                .setGpsNavigator(new GPSNavigator())
                .build();

    }
}
