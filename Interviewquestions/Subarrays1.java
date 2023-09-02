package Interviewquestions;

public class Subarrays1 {
	public static int Mark1(int[] arr,int n) {
		int max=Integer.MIN_VALUE;
		for (int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k =i;k<=j;k++) {
					sum+=arr[k];
				}
                max= Math.max(max, sum);
           }
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,5,-1,2,1,-5,4};
		int n=arr.length;
		int results=Mark1(arr,n);
		System.out.println("max sum of the subarray is " + results);
	}
}

