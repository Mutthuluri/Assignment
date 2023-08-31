import java.util.Scanner;

public class problem15 {
    // code to write sum of the digits in the given number
    public static void main(String[] args) {
        sumofdigits();
    }

    static void sumofdigits(){
        long temp,sum=0,number;
        Scanner vv = new Scanner(System.in);
        System.out.println("Enter the number of your choice");
       number = vv.nextLong();
        vv.close();
        for(int v=1;v!=0;v++){
           temp = number%10;
            sum = sum+temp;
            number = number/10;
        }
        System.out.println("The sum of the digits of the entered number is : "+sum);
    }
}
