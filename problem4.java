import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner vv = new Scanner(System.in);
        char c = vv.next().charAt(0);
        vv.close();
        if(c >= 'a' && c <= 'z'){
        System.out.println("you entered a lowe case letter");
        }
        if(c>= 'A' && c<='Z'){
            System.out.println("you entered a upper case letter");
        }
        if(c>=0 && c<=9){
            System.out.println("you enter a digit");
        }
        else{
            System.out.println("it is a special character");
        }

     
    }
}
