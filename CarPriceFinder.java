import java.util.Scanner;

class Car {
    public String getPrice() {
        return "Price not available";
    }
}


class Toyota extends Car {
    @Override
    public String getPrice() {
        return "25,000 RM";
    }
}


class BMW extends Car {
    @Override
    public String getPrice() {
        return "85,000 RM";
    }
}


class Tesla extends Car {
    @Override
    public String getPrice() {
        return "75,000 RM";
    }
}

public class CarPriceFinder {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        System.out.print("Enter the car name (Toyota, BMW, Tesla): ");
        String carName = we.nextLine();

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

        System.out.println("The price is: " + car.getPrice());

        we.close();
    }
}
