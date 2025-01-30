public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fueltype;
    public Vehicle(String color, int numberOfWheels, float engineSize, String fueltype) {
        this.numberOfWheels = numberOfWheels;
        this.engineSize = engineSize;
        this.fueltype = fueltype;
        this.color = color;
    }
    public void set_numberOfWheels(int i) {
        numberOfWheels = i;
    }
    public void set_engineSize(float f) {
        engineSize = f;
    }
    public void set_fueltype(String s) {
        fueltype = s;
    }
    public void set_color(String s) {
        color = s;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public String getFueltype() {
        return fueltype;
    }
    public String getColor() {
        return color;
    }
}
