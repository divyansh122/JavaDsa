package javaDSA;

public class array1 {
	public void Printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void Mainarray() {
		int[] arr1= {1,2,3,4,5};
		Printarray(arr1);
	}
	public static void main(String[] args) {
		array1 newarray=new array1();
		newarray.Mainarray();
	}
}
