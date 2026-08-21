package JavaClasses;
import java.util.*;

public class ques69leetcode {
    public static void main(String[] args) {

        int n = 0;

        int low = 1; int high = n;

        int ans = 0 ;

        while(low <= high){
            int  mid = low + (high - low)/2 ;
            long val = mid*mid;

            if(val > n){
                high = mid -1 ;
            }else{
                ans = mid;
                low = mid + 1 ;
            }
        }
        System.out.println(ans);
    }
}


//class Solution {
//    public int mySqrt(int x) {
//
//        int start = 1;
//        int end = x;
//        int ans = 0;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if ((long) mid * mid <= x) {
//                ans = mid;
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
//
//        return ans;
//    }
//}