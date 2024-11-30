public class CarMatrix {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        String[][] carMatrix = 
        {
            {"Toyota", "49000.50", "Make 1990"},
            {"Proton", "45000.00", "Make 2000"},
            {"Honda", "60000.75", "Make 2010"}

        };

        System.out.println("Cars with prices above 50,000 RM:");
        for (int i = 0; i < carMatrix.length; i++) {
            double price = Double.parseDouble(carMatrix[i][1]);
            if (price > 50000) {
                System.out.println("Car: " + carMatrix[i][0] + ", Price: RM " + carMatrix[i][1] + ", Make: " + carMatrix[i][2]);
            }
        }
    }
}