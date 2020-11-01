import java.util.Scanner;

public class piApproximation {
    public static void main(String[] args) {
        /* This program approximates the value of pi using a statistical approach based on a
        Monte-Carlo-Algorithm with one million iterations. It counts the number of times a random
        point lies inside a quarter circle with radius 1, which is on average proportional to the
        quarter circle's area. We are then able to derive the value of pi as four times that value,
        because the area of the whole circle equals pi (area = pi * r^2 = pi * 1^2 = pi) */

        double numIterations = 1000000; // Number of iterations to be calculated
        System.out.println("The value of pi is approximately: " + approximatePi(numIterations));
    }


    // Algorithm
    public static double approximatePi(double numIterations) {
        double pointsInsideQuarterCircle = 0; // Simple counter

        for (int i = 0; i < numIterations; i++) {
            double x = Math.random(); // Returns a random number between 0 and 1
            double y = Math.random();

            // Case if point lied within the quarter circle
            if ( x * x + y * y <= 1.0) {  // True due to Pythagorean theorem
                pointsInsideQuarterCircle++;
            }
        }
        return 4.0 * (pointsInsideQuarterCircle/numIterations); // Need to multiply times four as we are using a quarter circle
    }
}