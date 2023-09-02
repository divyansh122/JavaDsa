package Interviewquestions;
//Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
public class pascalstrianglevar1 {
	public static long nCr(int n,int r) {
		long res=1;
		for(int i=0;i<r;i++) {
			res=res*(n-i);
			res=res/(1+i);
		}
		return res;
	}
	public static int demo(int r,int c) {
        int element = (int) nCr(r-1, c-1);
        return element;
	}
	public static void main(String[] args) {
		int r=10;
		int c=4;
		pascalstrianglevar1 result=new pascalstrianglevar1();
		System.out.println(result.demo(r, c));
	}
}
