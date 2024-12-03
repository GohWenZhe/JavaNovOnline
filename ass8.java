import java.util.Scanner;

public class ass8 {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters); 
    }

    public void displayResult() {
        System.out.println("The person's name is " + name + ", he/she is " + age + " years old, and his/her BMI is " + calculateBMI());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ass8 person = new ass8();

        System.out.print("Enter the person's name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter the person's age: ");
        person.setAge(scanner.nextInt());

        System.out.print("Enter the person's height (in cm): ");
        person.setHeight(scanner.nextDouble());

        System.out.print("Enter the person's weight (in kg): ");
        person.setWeight(scanner.nextDouble());

        person.displayResult();

        scanner.close();
    }
}