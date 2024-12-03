import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Enter values for a 3x4 matrix");
        System.out.println("2. Enter values for a 2x3 matrix");
        int choice = we.nextInt();

        int[][] matrix;

        switch (choice) {
            case 1:
                matrix = new int[3][4];
                System.out.println("You selected a 3x4 matrix. Please enter the values:");
                break;
            case 2:
                matrix = new int[2][3];
                System.out.println("You selected a 2x3 matrix. Please enter the values:");
                break;
            default:
                System.out.println("Invalid choice! Please restart and choose either 1 or 2.");
                return;
        }

        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for position (" + i + "," + j + "): ");
                matrix[i][j] = we.nextInt();
            }
        }

        System.out.println("The matrix you entered is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        we.close();
    }
}