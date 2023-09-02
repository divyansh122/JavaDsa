package javaDSA;

public class Primenumber {
	public static int Prime(int[] arr)
	{
		int n=arr.length;
		int prime=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%1==0 && arr[i]%arr[i]==0) {
				prime=arr[i];
		}
	}
		return prime;
}
	public static void main(String[] args) {
		int[] arr= {1,2,7,4};
		System.out.println("prime in the array is "+Prime(arr));
	}
}
