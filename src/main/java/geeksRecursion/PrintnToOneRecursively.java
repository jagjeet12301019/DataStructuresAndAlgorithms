package geeksRecursion;

public class PrintnToOneRecursively {

	public static void main(String[] args) {
		printNo(5);
		System.out.println();
		System.out.println("INCREASING ORDER");
		printOnetoN(3);

	}
	
	public static void printNo(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n);
		printNo(n-1);			
	}
	public static void printOnetoN(int n) {
		if(n==0) {
			return;
		}
		printOnetoN(n-1);
		System.out.print(n);
	}

}
