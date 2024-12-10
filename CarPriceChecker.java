import java.util.Scanner;

class Car {
    void displayPrice() {
        System.out.println("Price not available for this car.");
    }
}

class Toyota extends Car {
    void displayPrice() {
        System.out.println("Toyota: 25,000 RM");
    }
}

class BMW extends Car {
    void displayPrice() {
        System.out.println("BMW: 85,000 RM");
    }
}

class Tesla extends Car {
    void displayPrice() {
        System.out.println("Tesla: 75,000 RM");
    }
}

public class CarPriceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car name (Toyota, BMW, Tesla): ");
        String carName = scanner.nextLine().trim();

        Car car;

        switch (carName.toLowerCase()) {
            case "toyota":
                car = new Toyota();
                break;
            case "bmw":
                car = new BMW();
                break;
            case "tesla":
                car = new Tesla();
                break;
            default:
                car = new Car();
                break;
        }

        car.displayPrice();

        scanner.close();
    }
}