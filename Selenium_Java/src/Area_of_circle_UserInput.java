import java.util.Scanner; 

public class Area_of_circle_UserInput {

	public static void main(String[] args) {
		
		 Scanner obj= new Scanner(System.in);
		
		 System.out.println("Enter the value of radius");
		 
		double r= obj.nextDouble();
		
		 double A= Math.PI*(r*r);
		
		System.out.println("Area of circle is:" +A);
		
		obj.close();

	}

}
