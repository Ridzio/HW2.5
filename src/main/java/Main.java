// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    //it's Main origin-test1
    public static void main(String[] args) {
        // Создаем список автомобилей
        List<Car> cars = new ArrayList<>();
        cars.add(new Suzuki(2010, "Suzuki Swift", "Automatic", "Green", "Petrol", "Gasoline"));
        cars.add(new Toyota(2008, "Toyota Corolla", "Manual", "Red", "Petrol", "Gasoline"));
        cars.add(new Ford(2005, "Ford Focus", "Manual", "Blue", "Diesel", "Diesel"));
        cars.add(new Honda(2015, "Honda Civic", "Automatic", "Black", "Petrol", "Gasoline"));
        cars.add(new BMW(2020, "BMW 3 Series", "Automatic", "White", "Diesel", "Diesel"));
        cars.add(new Toyota(2017, "Toyota Camry", "Automatic", "Green", "Hybrid", "Gasoline"));
        cars.add(new Suzuki(2019, "Suzuki Vitara", "Automatic", "Green", "Diesel", "Diesel"));
        cars.add(new Ford(2002, "Ford Fiesta", "Manual", "Green", "Petrol", "Gasoline"));
        cars.add(new Honda(2012, "Honda Accord", "Automatic", "Yellow", "Petrol", "Gasoline"));
        cars.add(new BMW(2023, "BMW X5", "Automatic", "Blue", "Diesel", "Diesel"));

        // Вызываем методы
        printCarsAfter2006(cars);
        changeGreenCarsToRed(cars);
        changeCarColorBasedOnYear(cars, 2010, "Purple");
    }

    // Метод, который выводит информацию об автомобилях, выпущенных после 2006 года
    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            if (car.year > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println(car.model + " - устаревший авто");
            }
        }
    }

    // Метод, который меняет цвет авто на красный, если у него зеленый цвет
    public static void changeGreenCarsToRed(List<Car> cars) {
        for (Car car : cars) {
            if (car.color.equalsIgnoreCase("Green")) {
                car.changeColor("Red");
                System.out.println("Цвет автомобиля " + car.model + " изменен на красный.");
            }
        }
    }

    // Метод, который меняет цвет авто на определенный, если его год выпуска после указанного
    public static void changeCarColorBasedOnYear(List<Car> cars, int year, String newColor) {
        for (Car car : cars) {
            if (car.year > year) {
                car.changeColor(newColor);
                System.out.println("Цвет автомобиля " + car.model + " изменен на " + newColor + ".");
            }
        }
    }
}
