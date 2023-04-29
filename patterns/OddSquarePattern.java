/*Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357 */

package patterns;

import java.util.Scanner;

public class OddSquarePattern {

    public static void main(String[] args) {
        try (// Write your code here
        Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            int j = 1;
            while (i <= n) {
                int odd = 2 * i - 1;
                j = n;
                while (j >= i) {
                    System.out.print(odd);
                    odd = odd + 2;
                    j = j - 1;
                }
                j = 1;
                int k = 1;
                while (j <= i - 1) {
                    System.out.print(k);
                    k = k + 2;
                    j = j + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }
    }
}
