import java.util.Scanner;

interface Car {
    void displayPrice();
    void displayMessage();
}

class Toyota implements Car {
    public void displayPrice() {
        System.out.println("Price: 25,000 RM");
    }

    public void displayMessage() {
        System.out.println("Toyota is famous brand in the world");
    }
}

class BMW implements Car {
    public void displayPrice() {
        System.out.println("Price: 85,000 RM");
    }

    public void displayMessage() {
        System.out.println("BMW is one of the coolest cars in the world.");
    }
}

class Tesla implements Car {
    public void displayPrice() {
        System.out.println("Price: 75,000 RM");
    }

    public void displayMessage() {
        System.out.println("Yes, Tesla is the best electric car.");
    }
}

public class Interface {
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
                System.out.println("Car not recognized.");
                scanner.close();
                return;
        }

        car.displayPrice();
        car.displayMessage();

        scanner.close();
    }
}
