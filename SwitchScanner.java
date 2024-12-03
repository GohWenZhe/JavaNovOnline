
import java.util.Scanner;

public class SwitchScanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();
        scanner.close();
        

        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day of the week: " + dayName);
    }
    
}
