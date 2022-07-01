package daythree;

public class Task5 {

    public static void main(String[] args) {

        Car audi = new Car("KN-9626", "Audi", "A4", 5);

        audi.drive();
        audi.setCurrentGear(1);
        audi.drive();
        System.out.println(audi.getSpeed());
        audi.setCurrentGear(3);
        audi.drive();
        System.out.println(audi.getSpeed());
        audi.setSteeringDirection("Left");
        System.out.println(audi.getSteeringDirection());

        Truck ford = new Truck("OH-3888", "Ford", "F-150", 6, 200);
        ford.setCargoWeight(1600);
    }
}
