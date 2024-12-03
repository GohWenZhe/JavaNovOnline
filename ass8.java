import java.util.Scanner;

public class ass8 {
    private String name;
    private int age;
    private double height;
    private double weight;

    public ass8(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return (height - 100) / weight;
    }

    public void displayResult() {
        System.out.println("The person's name is " + name + ", he/she is " + age + " years old, and his/her BMI is " + calculateBMI());
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the person's height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the person's weight (in kg): ");
        double weight = scanner.nextDouble();

        ass8 person = new ass8(name, age, height, weight);

        person.displayResult();

        scanner.close();
    }
}