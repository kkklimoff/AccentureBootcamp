package daythree;

public abstract class Vehicle {

    protected String licenceNumber;
    protected String make;
    protected String model;
    protected double speed;

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public Vehicle(String licenceNumber, String make, String model){
        this.licenceNumber = licenceNumber;
        this.make = make;
        this.model = model;
        this.speed = 0;
    }
    public abstract void drive();
}
