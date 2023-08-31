import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
      
        System.out.println("Enter the year");
        Scanner vv = new Scanner(System.in);
        int number = vv.nextInt();
        vv.close();

        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println("Entered year is a leap year");
        } else {
            System.out.println("Entered number is not a leap year");
        }
    

    }

}
