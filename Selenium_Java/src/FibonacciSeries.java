
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=1, d; 
		
		for(int i=0; i<=10; ++i)
		{ 
			
			d= a+b;  
			System.out.println(+d); 
			a=b;
			b=d; 
		}
		
	}

}
