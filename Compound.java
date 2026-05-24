import java.util.Scanner;

public class Compound {
	public static void main(String[] args){

		//calculate compound interest

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your principal amount , time , and interest rate : ");

		double p = scanner.nextDouble(), t = scanner.nextDouble() , i = scanner.nextDouble();

		var amt = p*(Math.pow(((100+i)/100) , t));

		System.out.println("Here are your savings : " + amt );

		scanner.close();
		
	}
}
