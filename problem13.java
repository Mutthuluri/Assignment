import java.util.Scanner;
public class problem13 {
    




	public static void main(String[] args) {
		factorialtest();	
	}
	protected static void factorialtest() {
		int factorial =1;
		Scanner vv = new Scanner(System.in);
		System.out.println("enter the factorial number");
		int num = vv.nextInt();
		vv.close();
		for(int v=1;v<=num;v++){
			factorial = factorial*v;
		}
		System.out.println("the answer is "+factorial);
	}
	

}


