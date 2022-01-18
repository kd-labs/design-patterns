package designpatterns.creational.builder.product;

/*
    Modern implementation of builder pattern
 */
public class CarModern {

    private static InnerCarBuilder INSTANCE;

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public CarModern(CarType carType, int seats, Engine engine, Transmission transmission,
                     GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }

    public static InnerCarBuilder builder() {
        if(INSTANCE == null) INSTANCE = new InnerCarBuilder();
        return INSTANCE;
    }

    private static class InnerCarBuilder {

        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private GPSNavigator gpsNavigator;

        public void setCarType(CarType carType) {
            this.carType = carType;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public void setTransmission(Transmission transmission) {
            this.transmission = transmission;
        }

        public void setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
        }

        public CarModern build() {
            return new CarModern(carType, seats, engine, transmission, gpsNavigator);
        }
    }
}
