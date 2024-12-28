public class Testing {
    public static void main(String[] args) {
        // Print a message to verify execution
        System.out.println("Hello, Java!");

        // Example test: Calculate the sum of two numbers
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        
        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);

        // Example test: Check if a number is even or odd
        int testNumber = 15;
        if (testNumber % 2 == 0) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");
        }
    }
}
