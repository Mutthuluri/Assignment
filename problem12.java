 import java.util.Scanner;
public class problem12 {
   

  public static void numdivby7(){
		int count=0;
		Scanner vv = new Scanner(System.in);
		System.out.println("enter the starting number");
		int num1 = vv.nextInt();
		System.out.println("enter the ending number");
		int num2 = vv.nextInt();
		for(int v=num1+1;v<num2;v++) {
			if(v%2!=0) {
				count = count+1;
			}

		}
		System.out.println("the count of odd numbers between the range are:"+ count);
	}
	public static void main(String[] args) {
		numdivby7();
	}

}




