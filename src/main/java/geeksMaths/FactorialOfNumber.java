package geeksMaths;

public class FactorialOfNumber {

	public static void main(String[] args) {
		FactorialOfNumber obj = new FactorialOfNumber();
		System.out.println(obj.returnFactorial(3));

	}

	//Iterative implementation ||  THETA OF n !! this solution is better
	public int returnFactorial(int n) {
		int res = 1;		
		for(int i=2; i<=n; i++) {
			res = res*i;
		}		
		return res;
	}
	
	// Recursive Solution -- THETA OF n , but it takes THETA n auxilary space to store the method calls so first solution is better
	public int returnRecursiveFact(int n) {
		if(n==0) {
			return 1;
		}
		return n*returnRecursiveFact(n-1);
	}
}
