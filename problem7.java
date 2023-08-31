import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        System.out.println("enter the starting number");
        int num = vv.nextInt();
        System.out.println("enter the ending the number ");
        int numend = vv.nextInt();
        System.out.println("the range of given numbers");
        for (int v = num; v <= numend; v++) {
            System.out.println(v);
        }
    }
}
