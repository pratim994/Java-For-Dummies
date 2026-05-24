import  java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scanner = new  Scanner(System.in);
		
		 final double PI = 3.1415926535;

		System.out.print("Enter the radius of yourf cylinder: ");
		double radius = scanner.nextDouble();

		System.out.print("Enter the height of yoyr cylinder:  ");
		double height = scanner.nextDouble();


		double volume = PI*(radius*radius)*height;
		System.out.println("Volume of your cyclinder is :  " + volume);

		scanner.close();

	}
}

