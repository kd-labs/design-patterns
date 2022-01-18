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

    public static class InnerCarBuilder {

        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private GPSNavigator gpsNavigator;

        public InnerCarBuilder reset() {
            this.carType = null;
            this.seats = 0;
            this.engine = null;
            this.transmission = null;
            this.gpsNavigator = null;
            return this;
        }

        public InnerCarBuilder setCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public InnerCarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public InnerCarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public InnerCarBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public InnerCarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarModern build() {
            return new CarModern(carType, seats, engine, transmission, gpsNavigator);
        }
    }
}
