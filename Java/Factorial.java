import java.util.*;

class Factorial {
	public static void main(String[] args) {
		int n, f=1, i;
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Please enter a number: ");
		n = scan.nextInt();
	
		for(i=n; i>=1; i--) {
			f = f * i;
		}	
	
		System.out.println("The factorial of " + n + " is " + f + ".");
	}
}
