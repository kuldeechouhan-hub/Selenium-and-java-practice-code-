import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter First Number :");

		Double A = obj.nextDouble();

		System.out.println("Enter Second Number :");

		Double B = obj.nextDouble();

		System.out.println("Type the operation you want to perform +, - , *, /");

		char operator = obj.next().charAt(0);

		obj.close();
		
		switch (operator) {

		case '+':

			System.out.println("Addition is" + (A + B));
			break;

		case '-':
			System.out.println("Addition is" + (A - B));
			break;

		case '*':
			System.out.println("Addition is" + (A * B));
			break;

		case '/':

			System.out.println("Addition is" + (A / B));
			break;
		
		default:
			System.out.println("No operation symbol is given");
		
		}

	}

}
