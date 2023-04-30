/*Number Star Pattern
Send Feedback
Print the following pattern for given number of rows.
Input format :

Line 1 : N (Total number of rows)

Sample Input :
   5
Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
 */
package tests;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(j);
                }

                for (int k = 1; k <= 2 * i - 2; k++) {
                    System.out.print("*");

                }

                for (int l = n - i + 1; l >= 1; l--) {
                    System.out.print(l);
                }

                System.out.println();
            }
        }
    }
}
