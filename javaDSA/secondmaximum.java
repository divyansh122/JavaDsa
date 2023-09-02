package javaDSA;

public class secondmaximum {
	public int Secondmin(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax && arr[i]!=max) {
				secondmax=arr[i];
			}
		}
		return secondmax;
	}
	public static void main(String[] args) {
		int[] arr= {13,34,2,31,30,1};
		secondmaximum results=new secondmaximum();
		System.out.println(results.Secondmin(arr));
	}
}
