/*Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654 */
package patterns;

import java.util.Scanner;

public class TriangleOfNumbers {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n - i) {
                    System.out.print(" ");
                    j = j + 1;

                }
                int count = 1;
                int num = i;
                while (count <= i) {
                    System.out.print(num);
                    num = num + 1;
                    count = count + 1;
                }
                num = num - 2;
                count = 1;
                while (count < i) {
                    System.out.print(num);
                    num = num - 1;
                    count = count + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }
    }
}
