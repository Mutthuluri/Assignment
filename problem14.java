import java.util.Scanner;

public class problem14 {
	public static void main(String[] args) {
		digitCounter();
	}

	public static void digitCounter() {
		int count =0,temp,v;
		Scanner vv = new Scanner(System.in);
		System.out.println("enter the  number");
		int num = vv.nextInt();
		vv.close();
		for(v=1;num!=0;v++){
           temp = num/10 ;
            num = temp;
            count = count+1;
			
        }

		System.out.println("the answer is "+count);
	}

}
