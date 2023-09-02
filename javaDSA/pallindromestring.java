package javaDSA;

public class pallindromestring {
	public boolean check(String a) {
		char[] arr=a.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		pallindromestring arr=new pallindromestring();
		if(arr.check("MADAM")) {
			System.out.println("Plaindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}

