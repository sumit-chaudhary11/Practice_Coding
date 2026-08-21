import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();    //number of integers in array
        int target = sc.nextInt();  // target we want to find
        int [] arr = new int[n];    // initializing the array
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0 ; int end = n-1;
        while(start <= end){

                int temp = arr[end] + arr[start];
                if(temp == target ){
                    System.out.println(start + " " + end);
                }
                if(temp<target){
                    start++;
                }else{
                    end--;
                }
            }
        }
    }

