import java.util.Scanner;
public class Factorial_Number {

	public static void main(String[] args) {

		int j=1,n;
    
		System.out.println("Enter Number");
		
		Scanner scn = new Scanner(System.in);
		n= scn.nextInt();
		scn.close();
		for(int i=n; i>=1; i--)
		{
			    j=j*i; 
			    
		}
		System.out.println("Factorial of a number is" +j);	
		
	}

}
