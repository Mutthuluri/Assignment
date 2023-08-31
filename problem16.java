import java.util.Scanner;

public class problem16 {
    public static void main(String[]args){
        int num,v;
        System.out.println("Enter an even number");
        Scanner vv = new Scanner(System.in);
        do{
            num = vv.nextInt();
            if(num %2!=0){
                System.out.println("Entered number is odd number.\n so please enter an even number");}
                else{
                    System.out.println("yes you have succesfully entered the even number");
                }
            
        }while(num %2!=0);
        System.out.println("The factors of the given even number are:");
    for(v=1;v<=num;v++){
        if(num%v==0){
            System.out.println(v);
        }
            
        
    }
    }
    
}
