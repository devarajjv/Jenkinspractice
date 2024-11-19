public class Factorial {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		
		int result = fact(n);
		
		System.out.println(result);
		

	}
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		
		return (n*fact(n-1));
	}

}
