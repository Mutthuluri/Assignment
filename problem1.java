import java.util.Scanner;

public class problem1{
    public static void main(String[]args){
        add();
    }
    public static void add() {
		    	int num1, num2;
		    	System.out.println("Enter the 1st  number:");
		        Scanner vv = new Scanner(System.in);
		        num1 = vv.nextInt();
		        System.out.println("Enter the 2nd number:");
		        num2 = vv.nextInt();
		        vv.close();
		        int c = num1+num2;
		        System.out.println("The addition of two numbers is: "+ c);
		      
		    }
}