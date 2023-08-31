import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
		int i;
		try (Scanner vv = new Scanner(System.in)) {
			System.out.println("enter the starting number");
			int numstart = vv.nextInt();
			System.out.println("enter the ending number");
			int numend   = vv.nextInt();
			vv.close();
			System.out.println("The numbers divisible by 3 and 5 are :");
			for(i=numstart;i<=numend;i++){
				if(i%3==0 && i%5==0){
					System.out.println(i);
				}
			}
		}
	}
}
