package javaDSA;

public class Removeevennumber {
	public static void Printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int[] Removeeven(int[] arr1) {
		int oddc=0;
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				oddc++;
			}
		}
		int[] result=new int[oddc];
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				result[index]=arr1[i];
				index++;
			}
		}
		
		return result;
	}
	public static int[] Removeodd(int[] arr) {
		int evenc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenc++;
			}
		}
		int[] result=new int[evenc];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				result[index]=arr[i];
				index++;
			}
		}
		System.out.println("List of even number in the array is ");

		return result;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,6,3,7,8,10};
		Printarray(arr);
		System.out.println("List of odd number in this array");
		int[] result=Removeeven(arr);
		Printarray(result);
		int[] result2=Removeodd(arr);
		Printarray(result2);
	}
}
