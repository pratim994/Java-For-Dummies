import java.util.Scanner;

// create a calculator to implement the use of enhanced switches and ternary operators


public class Calculator {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter the operands");
		int a = scanner.nextInt() , b = scanner.nextInt();

		System.out.println(" Enter the operation ");

		String operation = scanner.next().toUpperCase();


		switch (operation) {

			case "ADD" -> System.out.println(a+b);

			case "SUB" -> System.out.println(a-b);

			case "MUL" -> System.out.println(a*b);

			case "DIV" ->  System.out.println(a/b);
			
			default -> System.out.println("not a valid operation");

		}

	scanner.close();
	}

}
