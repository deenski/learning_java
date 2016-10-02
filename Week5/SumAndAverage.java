/*
 * Compute the sum and average of running numbers from a lowerbound to an upperbound using loop.
 */
public class SumAndAverage {   // Save as "SumAndAverage.java"
   public static void main (String[] args) {
      int sum = 0;          // Store the accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;   // The lowerbound to sum
      int upperbound = 100; // The upperbound to sum

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int/int produces int.
      average = (sum + .0) / upperbound;
      //......
      // Print sum and average.
      System.out.printf("The sum is %d%n", sum);
      System.out.printf("The average is %.2f%n", average);
      //......
   }
}