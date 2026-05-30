import java.util.Scanner;

public class Matrix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 3x3 matrix
        double[][] matrix = new double[3][3];

        System.out.println("Enter elements of 3x3 matrix:");

        // User input
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Element [" + i + "][" + j + "] : ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
 
   }

   static void calculateEigenValues(double[][] m) {

    double a = m[0][0];
    double b = m[0][1];
    double c = m[0][2];

    double d = m[1][0];
    double e = m[1][1];
    double f = m[1][2];

    double g = m[2][0];
    double h = m[2][1];
    double i = m[2][2];

    // Trace
    double trace = a + e + i;

    // Determinant
    double determinant =
            a * (e * i - f * h)
          - b * (d * i - f * g)
          + c * (d * h - e * g);

    // Sum of principal minors
    double minors =
            (a * e - b * d)
          + (a * i - c * g)
          + (e * i - f * h);

    System.out.println("Characteristic Equation:");

    System.out.println(
        "λ^3 - "
        + trace + "λ^2 + "
        + minors + "λ - "
        + determinant + " = 0"
    );
}
}
