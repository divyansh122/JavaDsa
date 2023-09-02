package Interviewquestions;

public class kadanesalgo1 {
	public static int maxInt(int[] arr,int n) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum+=arr[k];
				}
                max = Math.max(max,sum);

			}
		}
		return max;
	}
	public static void main (String[] args) {
		int[] arr= {-2,-3,4,-1,-2,1,5,-3};
		int n=arr.length;
		int maxSum=maxInt(arr,n);
		System.out.println("the max sum of any subarray is"+maxSum);
	}
}
