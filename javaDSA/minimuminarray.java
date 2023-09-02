package javaDSA;

public class minimuminarray {
	public int Findmin(int[] arr) {
		if (arr==null || arr.length==0) {
			throw new IllegalArgumentException("Not found");
		}
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args ) {
		int[] arr= {1,2,5,6,0,21};
		minimuminarray result=new minimuminarray();
		System.out.println(result.Findmin(arr));
	}
}
