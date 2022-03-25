package geeksMaths;

public class CountTrailingZeroesInFactorial {

	public static void main(String[] args) {
		CountTrailingZeroesInFactorial obj = new CountTrailingZeroesInFactorial();
		System.out.println(obj.returnZeros(100));

	}

	// Below solution will cause overflow
//	public int returnZeroes(int n) {
//		int fact = 1;
//		for(int i=2; i<=n; i++) {
//			fact = fact*i;
//		}
//		
//		int res = 0;
//		while(fact%10==0) {
//			res++;
//			fact = fact/10;			
//		}
//		return res;
//	}
	
	public int returnZeros(int n) {
		int countZ = 0;
		
		for(int i=5; i<=n; i=i*5) {
			countZ = countZ + n/i;
		}
		return countZ;
		
	}
	
}
