package jpmorgan.banking.newmodel;

public class Fibonacci {
	
	static void fib(int N)
    {
        int a = 0, b = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(a + " ");
  
            // Swap
            int c = a + b;
            a = b;
            b = c;
            counter += 1;
        }
    }
	
	public static void main(String args[]) {
//		fib(1);
		int n = 20;
//		for(int i = 1; i<=n; i++) {
//			for(int j = n;j>=i; j--)
//				System.out.print("  ");
//			for(int j = i;j>=1; j--)
//				System.out.print("* ");
//			for(int j = i;j>1; j--)
//				System.out.print("* ");
//			System.out.println();
//		}
		
		for(int i=1; i<=n; i++) {
			boolean isPrime = true;
			for(int j = 2; j*j<=i; j++) {
				if(i%j==0 && i!=j) {
					isPrime  = false;
					break;
				}
//				else System.out.println(i);
			}
			if(isPrime && i>1) System.out.println(i);
		}
	}

}
