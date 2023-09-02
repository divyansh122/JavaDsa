package classprogram;

import java.util.*;

public class Solution {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N, LeftDiagonalSum = 0, RightDiagonal = 0;
	        N = scanner.nextInt();
	        int[][] a = new int[N][N];
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                a[i][j] = scanner.nextInt();
	                if (i == j) {
	                    LeftDiagonalSum = LeftDiagonalSum + a[i][j];
	                }
	            }
	        }
	        for (int i = 0; i < N; i++) {
	            for (int j = N - 1 - i; j >= 0;) {
	                RightDiagonal = RightDiagonal + a[i][j];
	                break;
	            }
	        }
	        System.out.println(Math.abs(LeftDiagonalSum - RightDiagonal));
	 
    }
}
