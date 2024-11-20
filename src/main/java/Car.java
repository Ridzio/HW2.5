// Car.java
public abstract class Car {
    protected int year;
    protected String model;
    protected String gearbox;
    protected String color;
    protected String engineType;
    protected String fuelType;

    // Конструктор
    public Car(int year, String model, String gearbox, String color, String engineType, String fuelType) {
        this.year = year;
        this.model = model;
        this.gearbox = gearbox;
        this.color = color;
        this.engineType = engineType;
        this.fuelType = fuelType;
    }

    // Метод для получения полной информации
    public String getFullInfo() {
        return "Модель: " + model + ", Год выпуска: " + year + ", Коробка передач: " + gearbox +
                ", Цвет: " + color + ", Тип двигателя: " + engineType + ", Тип топлива: " + fuelType;
    }

    // Метод для изменения цвета
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Абстрактный метод, который будет специфичен для каждого автомобиля
    public abstract void carDetails();
}
