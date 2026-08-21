import java.util.*;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length;i++){
            for(int j =0 ; j<matrix[i].length; j++){
            matrix[i][j] = sc.nextInt();
            }
        }
        int row = 0;
        int col = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
       }
    }


