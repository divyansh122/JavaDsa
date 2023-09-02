package Interviewquestions;


public class setmatrixzero {
	public static void markrow(int [][] arr,int n,int m,int i) {
		for(int j=0;j<m;j++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
	public static void markcol(int[][] arr,int n,int m,int j) {
		for(int i=0;i<n;i++) {
			if(arr[i][j]!=0) {
				arr[i][j]=-1;
			}
		}
	}
	public static int[][] zeroMatrix(int[][] arr,int n,int m){
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markrow(arr, n, m, i);
                    markcol(arr, n, m, j);
                    }
                }
}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(arr[i][j]==-1) {
				arr[i][j]=0;
			}
		}
	}
	return arr;
}
	public static void main(String[] args) {
		int[][] arr= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int n=arr.length;
		int m=arr[0].length;
		int[][] temp=zeroMatrix(arr,n,m);
		System.out.println("The Final matrix is: ");
        for (int[] row : temp) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
	}
}
