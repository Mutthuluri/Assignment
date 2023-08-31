import java.util.Scanner;
public class problem11 {
  public static void numdivby7(){
		int count=0;
		Scanner vv = new Scanner(System.in);
		System.out.println("enter the starting number");
		int num1 = vv.nextInt();
		System.out.println("enter the ending number");
		int num2 = vv.nextInt();
		for(int v=num1;v<num2;v++) {
			if(v%7==0) {
				count = count+1;
			}

		}
		System.out.println("the count of numbers divisible by 7 are:"+ count);
	}
	public static void main(String[] args) {
		numdivby7();
	}

}


