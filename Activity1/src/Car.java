class Vehicle {
    public String brand = "Mitsubishi";

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine is off");
    }
}

public class Car extends Vehicle {
    public String modelName = "Xpander";

    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.startEngine();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
