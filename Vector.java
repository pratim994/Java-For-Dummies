import java.util.Scanner;

// CALCULATE MAGNITUDE OF TWO 3 DIMENSIONAL VECTORS 
// THIS EXAMPLE IS TO DEMONSTRATE THE USE OF MATH.ABS AND MATH.SQRT

public class Vector {
	public static void main(String[] args){

	Scanner scanner  = new Scanner(System.in);

	System.out.println("Enter the x, y and z of your vector : ");

	int x = scanner.nextInt(); int y = scanner.nextInt(); int z = scanner.nextInt();

	var magnitude = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y,2) + Math.pow(z, 2)));

	System.out.println("Here is the magnitude : " + magnitude);	



	scanner.close();


	}

}
