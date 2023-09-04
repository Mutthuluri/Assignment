public class problem18 {
    int k;
    {
        k=10;
    }
    int j=25;
    {
        System.out.println(k);
        System.out.println(j);
    }
    public static void main(String[]args){
        System.out.println("from main()");
        problem18 probe = new problem18();
        System.out.println(probe.k);
        System.out.println(probe.j);
        problem18 probe2 = new problem18();
        System.out.println(probe2.k);
        System.out.println(probe2.j);

    }
    {
        k=5;
        j=7;
    }
}
