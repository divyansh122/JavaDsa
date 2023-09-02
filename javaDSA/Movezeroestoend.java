package javaDSA;

public class Movezeroestoend {
	public  void Printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public  void Movezeroes(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public void demo() {
		int[] arr= {1,2,3,0,5,1,0,9};
		Printarray(arr);
		Movezeroes(arr,arr.length);
		Printarray(arr);
	}
	public static void main(String[] args) {
		Movezeroestoend arrutil=new Movezeroestoend();
		arrutil.demo();
	}
}
