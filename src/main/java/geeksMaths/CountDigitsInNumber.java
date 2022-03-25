package geeksMaths;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		
		CountDigitsInNumber obj = new CountDigitsInNumber();
		System.out.println(obj.returnDigit(1234));

	}
	
	// As we are simply traversing through the digits in number n, complexity is THETA(d) where d are digits in n.
	public int returnDigit(int n) {
		int res = 0;
		while(n>0) {
			n = n/10;
			res++;
		}		
		return res;
		
	}

}
