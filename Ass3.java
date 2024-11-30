import java.util.Scanner;

public class Ass3 {

    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        String[][] VIPMatrix = new String[5][4];
        String[][] CheapMatrix = new String[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price for car " + (i + 1) + " (in RM): ");
            double price = we.nextDouble();

            // if-else statement
            if (price >= 70000) {
                VIPMatrix[i][0] = String.valueOf(price);
                VIPMatrix[i][1] = "VIP";                    
                VIPMatrix[i][2] = "2024";                   
                VIPMatrix[i][3] = "pre-order";             
            } else {
                CheapMatrix[i][0] = String.valueOf(price);
                CheapMatrix[i][1] = "Cheap";                
                CheapMatrix[i][2] = "old";                  
                CheapMatrix[i][3] = "for sale";             
            }
        }

        //for VIP
        System.out.println("\n--- VIP Cars ---");
        for (int i = 0; i < 5; i++) {
            if (VIPMatrix[i][0] != null) { 
                System.out.println("Car " + (i + 1) + ": RM " + VIPMatrix[i][0] + ", " + VIPMatrix[i][1] + ", " + VIPMatrix[i][2] + ", " + VIPMatrix[i][3]);
            }
        }

        //for Cheap
        System.out.println("\n--- Cheap Cars ---");
        for (int i = 0; i < 5; i++) {
            if (CheapMatrix[i][0] != null) { 
                System.out.println("Car " + (i + 1) + ": RM " + CheapMatrix[i][0] + ", " + CheapMatrix[i][1] + ", " + CheapMatrix[i][2] + ", " + CheapMatrix[i][3]);
            }
        }
    }
}