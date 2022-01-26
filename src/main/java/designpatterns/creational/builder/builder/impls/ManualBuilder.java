package designpatterns.creational.builder.builder.impls;

import designpatterns.creational.builder.builder.Builder;
import designpatterns.creational.builder.product.*;

public class ManualBuilder implements Builder {

    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator navigator;
    private int seats;

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

    public Manual getResult() {
        return new Manual(type, seats ,engine, transmission, navigator);
    }
}
