import java.util.Scanner;

abstract class Car
{
    abstract void displayPrice();
    abstract void displaySlogan();
}

class Toyota extends Car {
    void displayPrice() {
        System.out.println("Price: 25,000 RM");
    }

    void displaySlogan() {
        System.out.println("Slogan: Japan Car");
    }
}

class BMW extends Car {
    void displayPrice() {
        System.out.println("Price: 85,000 RM");
    }

    void displaySlogan() {
        System.out.println("Slogan: German Car.");
    }
}

class Tesla extends Car {
    void displayPrice() {
        System.out.println("Price: 75,000 RM");
    }

    void displaySlogan() {
        System.out.println("Slogan: United State Car.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        System.out.print("Enter the car name (Toyota, BMW, Tesla): ");
        String carName = we.nextLine().trim();

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
                we.close();
                return;
        }

        car.displaySlogan();
        car.displayPrice();

        we.close();
    }
}
