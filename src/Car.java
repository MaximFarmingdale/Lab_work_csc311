public class Car extends Vehicle {
    String brand;
    public Car(String color, int numberOfWheels, float engineSize, String fueltype, String brand) {
    super(color, numberOfWheels, engineSize, fueltype);
        this.brand = brand;
    }
    public void honk() {
        System.out.println("Honk,honk!");
    }
    public void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Engine Size: " + engineSize);
    System.out.println("Fuel type: " + fueltype);
    System.out.println("Color: " + color);
    System.out.println("Number of Wheels: " + numberOfWheels);

    }

}
