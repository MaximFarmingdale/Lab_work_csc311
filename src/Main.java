//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle Vehicle_one = new Vehicle("blue",4, 16, "Gasoline");
        Vehicle_one.set_color("red");
        Vehicle_one.set_fueltype("Leaded Gasoline");
        Vehicle_one.set_engineSize(12);
        Vehicle_one.set_numberOfWheels(5);
        System.out.println(Vehicle_one.getNumberOfWheels());
        System.out.println(Vehicle_one.getColor());
        System.out.println(Vehicle_one.getFueltype());
        System.out.println(Vehicle_one.getEngineSize());
        Car car_one = new Car("blue",4,12,"Gasoline","BMW");
        car_one.honk();
        car_one.displayInfo();
    }
}