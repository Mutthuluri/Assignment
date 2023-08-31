import java.util.Scanner;

class student {

String name, address;
	long phoneNumber, erpNo;
	int div;
	  public void studentname() {
	        System.out.println("enter the student name :");
	        Scanner vv = new Scanner(System.in);
	        name = vv.next();
	       
	    }

	    public void enrollmentNumber() {
	        System.out.println("enter the enrollmentNumber :");
	        Scanner vv = new Scanner(System.in);
	        erpNo = vv.nextLong();
	        
	    }

	    public void address() {
	        System.out.println("enter address :");
	        Scanner vv = new Scanner(System.in);
	         address = vv.nextLine();
	        
	        
	    }

	    public void phoneNumberanddivision() {
	        System.out.println("enter the phone number :");
	        Scanner vv = new Scanner(System.in);
	         phoneNumber = vv.nextLong();
	        System.out.println("enter the division :");
	         div = vv.nextInt();

	       
	}
	    public void print() {
	    	 System.out.println("The details of the given student are:");
	    	 System.out.println(name);
	    	 System.out.println(phoneNumber);
	    	 System.out.println(address);
	    	 System.out.println(erpNo);
		     System.out.println(div);
	    }
}

public class problem2 {

	public static void main(String[] args) {
		
		student stu = new student();
		        stu.studentname();
		        stu.enrollmentNumber();
		        stu.address();
		        stu.phoneNumberanddivision();
		        stu.print();

		    }
	}
