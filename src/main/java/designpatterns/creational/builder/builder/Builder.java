package designpatterns.creational.builder.builder;

import designpatterns.creational.builder.product.*;

public interface Builder {

    public void setCarType(CarType type);
    public void setEngine(Engine engine);
    public void setTransmission(Transmission transmission);
    public void setGPSNavigator(GPSNavigator navigator);
    public void setSeats(int seats);

}
