package javaDSA;

public class missingnumber {
	public int Findmissing(int[]arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	public static void main(String[] args) {
		missingnumber result=new missingnumber();
		int[] arr= {1,2,3,4,5,7,8,9};
		System.out.println(result.Findmissing(arr));
	}
}

