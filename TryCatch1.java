import java.util.Scanner;

public class TryCatch1{

    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        int[] numbers = new int[12];
        System.out.println("Please enter 12 numbers:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = we.nextInt();
        }

        System.out.println("Choose an option:");
        System.out.println("1. 3x4 matrix");
        System.out.println("2. 2x3 matrix");
        int choice = we.nextInt();

        int[][] matrix = null;

        try {
            switch (choice) {
                case 1:
                    matrix = new int[3][4];  // 3x4 matrix
                    System.out.println("You selected a 3x4 matrix.");
                    break;
                case 2:
                    throw new ArrayIndexOutOfBoundsException("Error: A 2x3 matrix cannot hold 12 values!");
                default:
                    System.out.println("Invalid choice!");
                    we.close();
                    return;  
            }

            int index = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) { 
                    if (index < numbers.length) {
                        matrix[i][j] = numbers[index];
                        index++;
                    }
                }
            }

            System.out.println("The matrix you entered is:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        we.close();
    }
}