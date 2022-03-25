package geeksMaths;

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.returnIsPalindrome(121));

	}
	
	
	// As we are simply traversing through the digits in number n complexity is THETA(d) where d are digits in n.
	public boolean returnIsPalindrome(int n) {
		int numberNew = 0;
		int temp = n;
		
		while(temp>0) {
			int lastDigit = temp%10; //1 || 2 || 1
			numberNew = numberNew*10 + lastDigit; //0*10+1 = 1 || 1*10+2 = 12 || 12*10+1 = 121
			temp = temp/10; // 12 || 1 || 0 and while loop breaks here
		}		
		return (numberNew==n);
	}
	
}
