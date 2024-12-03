import java.util.Scanner;

public class AssignmentFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cheapCars = new String[5][4];
        int cheapIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price of car " + (i + 1) + ": ");
            int price = scanner.nextInt();

            if (price > 70000) {
                if (cheapIndex < cheapCars.length) {
                    cheapCars[cheapIndex][0] = String.valueOf(price);
                    cheapCars[cheapIndex][1] = "Cheap";
                    cheapCars[cheapIndex][2] = "old";
                    cheapCars[cheapIndex][3] = "for sale";
                    cheapIndex++;
                }
            }
        }

        System.out.println("Cheap Cars:");
        boolean hasCheapCars = false;
        for (String[] row : cheapCars) {
            if (row[0] != null) {
                hasCheapCars = true;
                for (String cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
        if (!hasCheapCars) {
            System.out.println("No cheap cars available.");
        }

        scanner.close();
    }
}