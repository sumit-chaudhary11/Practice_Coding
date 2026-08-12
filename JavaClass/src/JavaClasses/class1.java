package JavaClasses;

public class class1 {
    public static void main(String[] args) {

       // System.out.println("Hello World");
       // System.out.print("Hello World\n");

        if(System.out.printf("Hello World") != null){
            int val = 24 * 60 * 360 * 60 * 1000;
            long val2 = 24L * 60* 360 * 60 * 1000; // here we have to use the l with any one of the integer values given here
            // to convert the value of val in long
            // if we don't use L there no val updation

            System.out.println(val);
            System.out.println(val2);
//            31104000000
//            1039228928
        }
    }

}
