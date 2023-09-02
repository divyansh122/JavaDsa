package javaDSA;

public class resizearray {
	public void  Printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	public int[] Resize(int[] arr,int capacity) {
		int[] temp=new int[capacity]; 
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		resizearray result=new resizearray();
		int[] arr={1,2,3,4,5,5};
		System.out.println("the size of the original array is"+arr.length);
		arr=result.Resize(arr,arr.length*2);
		System.out.println("the size of the resized array is"+arr.length);
	}
}
