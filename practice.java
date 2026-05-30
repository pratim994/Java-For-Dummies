//Write a program to implement simple calculator , it should use regex matching to search for operators 


import java.utils.*;

public class Solution {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first operand");

		int a = scanner.nextInt();

		Sytem.out.println("Enter the second number ");

		int b = scanner.nextInt();

		System.out.println("Enter the operation");

		char c = scanner.charAt();

		switch(c){
			case '+' :
				System.out.println(a+b);
				break;

			case '-' :
				System.out.println(a-b);
				break;

			case '*' :
				System.out.println(a*b);
				break;

			case '/' :
				System.out.println(a/b);
				break;

			default :
				System.out.println("Invalid operations ");
				break;
		}

	}

}
