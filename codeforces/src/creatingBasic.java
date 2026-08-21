import java.util.*;
public class creatingBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b =  sc.nextInt();

for(int i = 2 ; i<100;i++) {


    l = l * (i * 3);
    b = b * (i * 2);
    i++;

    System.out.println(l);
    System.out.println(b);
         }
    }
}
