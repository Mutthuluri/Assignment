import java.util.Scanner;

public class problem6 {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int days = getDaysInMonth(month, year);
            if (days != -1) {
                System.out.println("There are " + days + " days in the selected month.");
            } else {
                System.out.println("Invalid month.");
            }
        } else {
            System.out.println("Invalid month. Please enter a valid month (1-12).");
        }
    }
}
