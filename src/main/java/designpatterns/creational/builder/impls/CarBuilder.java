package designpatterns.creational.builder.impls;

import designpatterns.creational.builder.builder.Builder;
import designpatterns.creational.builder.product.*;

public class CarBuilder implements Builder {

    private CarType type;
    private Engine engine;
    private int seats;
    private Transmission transmission;
    private GPSNavigator navigator;

    @Override
    public void setCarType(CarType type) {
       this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
       this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, navigator);
    }
}
