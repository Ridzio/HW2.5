// Suzuki.java
public class Suzuki extends Car {
    public Suzuki(int year, String model, String gearbox, String color, String engineType, String fuelType) {
        super(year, model, gearbox, color, engineType, fuelType);
    }

    @Override
    public void carDetails() {
        System.out.println("Марка: Suzuki");
    }
}