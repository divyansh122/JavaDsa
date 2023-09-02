package Interviewquestions;
//This is the better approach to make the matrix zero having time complexity of O(n^2)
public class setmatrixzerobetterapproach {
	public static int[][] setZeroes(int[][] matrix,int n ,int m){
		int[] row=new int[n];
		int[] col=new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(matrix[i][j]==0) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(row[i]==1|| col[j]==1) {
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		int[][] arr= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int n=arr.length;
		int m=arr[0].length;
		int[][] temp=setZeroes(arr,n,m);
		System.out.println("The Final matrix is: ");
        for (int[] row : temp) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
	}
 }
