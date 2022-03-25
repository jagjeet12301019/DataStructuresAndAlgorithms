package geeksMaths;

public class GCDorHCF {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(16));
		
		System.out.println(2/3);

	}
	
	public static boolean isPowerOfTwo(int n) {
		if(n==0) {
			return false;
		}
		else if(n==1) {
			return true;
		}
		else if(n%2!=0) {
			return false;
		}
		return isPowerOfTwo(n/2);
    }

}
