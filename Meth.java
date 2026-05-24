import java.util.Scanner;

// since math class is imported in java.lang I dont need to explicitly import it as it is there by default

//  AS A FUN CHALLENGE i AM GOING TO IMPLEMMENT GEOMETRIC PROGRESSION
//  WHAT YOU NEED TO ENTER , FIRST TERM , COMMON RATIO, NUMBER 0T TERMS TO SUM
// Man using math as a class name is giving me error while using Math.pow() , what a sad joke 
//

public class Meth{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("We are calculating geometric sum today , enter the first sum of the series : ");

	double a = scanner.nextDouble();

	System.out.println("Enter the common ratio : ");

	double r = scanner.nextDouble();

	System.out.println("Enter the number of terms or n : ");

	double n = scanner.nextDouble();

	double answer = a*(Math.pow(r, n) - 1)/(r - 1);

	System.out.println("Your answer is : " + answer);



	scanner.close();
	}

}
