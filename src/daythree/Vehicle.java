package daythree;

public abstract class Vehicle {

    protected String licenceNumber;
    protected String make;
    protected String model;
    protected double speed;

    public Vehicle(String licenceNumber, String make, String model) {
        this.licenceNumber = licenceNumber;
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void drive();
}
