package arrays;

public class Try {
	
	public static void main(String[] args) {
		
		Try obj = new Try();
		System.out.println(obj.addSol(3));
		System.out.println(obj.addSol2(3));

	}
	
	public int addSol(int n) {
		int  res = 0;
		for(int i=1; i<=n; i++) {
			res = res+i;
		}
		return res;
	}
	
	public int addSol2(int n) {
		int i=1;
		int res = 0;
		while(i<=n) {
			res = res+i;
			i++;
		}
		return res;
	}

}
