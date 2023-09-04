public class problem19 {
    String name;
    int id;
    long cno;
    String schname = "Parul university";
    public void getAttribute(){
        System.out.println("student name:"+ name);
        System.out.println("student id:"+id);
        System.out.println("student number:"+cno);
        System.out.println("school name: "+ schname);
    }
    public static void main(String[]args){
        problem19 st1= new problem19();
        st1.getAttribute();
        problem19 st2 = new problem19();
        st2.getAttribute();


    }
}
