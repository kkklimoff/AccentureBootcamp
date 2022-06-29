package daythree;

public class Car extends Vehicle {

    final protected int numberOfGears;
    protected int currentGear;
    protected String steeringDirection;

    public Car(String licenceNumber, String make, String model, int numberOfGears) {
        super(licenceNumber, make, model);
        this.numberOfGears = numberOfGears;
        this.currentGear = 0;
        this.steeringDirection = "Straight";
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getSteeringDirection() {
        return steeringDirection;
    }

    public void setSteeringDirection(String steeringDirection) {
        if ((this.steeringDirection.equals(steeringDirection)) || !((steeringDirection.equals("Right")) || (steeringDirection.equals("Left"))))
            System.out.println("Invalid steering direction");
        else this.steeringDirection = steeringDirection;
    }

    @Override
    public void drive() {
        if (this.currentGear != 1 && this.speed == 0) {
            System.out.println("You can only start in the 1st gear");
            return;
        }
        this.speed = this.currentGear * 20;

    }
}
