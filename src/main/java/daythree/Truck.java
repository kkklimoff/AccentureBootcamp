package daythree;

public class Truck extends Car {

    final static int MAX_CARGO_WEIGHT = 1500;
    protected int cargoWeight;

    public Truck(String licenceNumber, String make, String model, int numberOfGears, int cargoWeight) {
        super(licenceNumber, make, model, numberOfGears);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        if (cargoWeight < 0 || cargoWeight > MAX_CARGO_WEIGHT) System.out.println("Invalid cargo weight.");
        else this.cargoWeight = cargoWeight;
    }
}
