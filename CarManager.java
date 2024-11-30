import java.util.Scanner;

public class CarManager {

    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void displayDetails() {
            System.out.println("Model: " + model);
            System.out.println("Make: " + make);
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager manager = new CarManager();

        System.out.println("Enter details for Car 1:");
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Make: ");
        String make1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter details for Car 2:");
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Make: ");
        String make2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter details for Car 3:");
        System.out.print("Model: ");
        String model3 = scanner.nextLine();
        System.out.print("Make: ");
        String make3 = scanner.nextLine();
        System.out.print("Price: ");
        double price3 = scanner.nextDouble();

        Car car1 = manager.new Car(model1, make1, price1);
        Car car2 = manager.new Car(model2, make2, price2);
        Car car3 = manager.new Car(model3, make3, price3);

        System.out.println("\nCar 1 Details:");
        car1.displayDetails();
        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
        System.out.println("\nCar 3 Details:");
        car3.displayDetails();

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.printf("\nAverage Price of Cars: $%.2f\n", averagePrice);
    }
}
