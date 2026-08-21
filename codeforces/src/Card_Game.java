import java.util.*;

public class Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n-1;
        int score_1 = 0;
        int score_2 = 0;
        boolean dima = true;

        while (start <= end) {
            int picked;
            if (arr[end] > arr[start]) {
                picked = arr[end];
                end--;
            } else {
                picked = arr[start];
                start++;
            }

            if (dima){
                score_1 += picked;
            }else{
                score_2 += picked;
            }
            dima = !dima;

        }
        System.out.println(score_1 + " " + score_2);
    }
}

