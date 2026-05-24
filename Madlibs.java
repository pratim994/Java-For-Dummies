import java.util.Scanner;



public class Madlibs{
	
	public static void main(String[] args)
	{
		//make a mad libs game 
		// take a for loop to input strings and insert them into your para 


		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of words you want in the game : " );
		int offset = scanner.nextInt();

		while(offset > 0)
		{
			String word = scanner.nextLine();

			System.out.println("I hate it when :" + word);

			offset--;
		}



		scanner.close();
	}


}
