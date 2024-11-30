public class Car {
    private int carYear;
    private double carPrice;
    private String carName;

    public Car(int carYear, double carPrice, String carName) {
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.carName = carName;
    }

    public void DisplayDetails() {
        double carValue = carYear * carPrice;
        System.out.println("Car Name: " + carName);
        System.out.println("Car Year: " + carYear);
        System.out.println("Car Price: $" + carPrice);
        System.out.println("Car Value: $" + carValue);
    }

    public static void main(String[] args)
   {
        Car car = new Car(2002, 41856.50, "Toyota");
        car.DisplayDetails();
   }
}