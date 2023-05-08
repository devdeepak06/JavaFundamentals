/*Maximise the sum
Send Feedback
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). 
Then we'll switch to array at element 10 and take till 15. 
So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
 */

package tests;

import java.util.*;

public class MaximizeSum {
    public static long maximumSumPath(int[] input1, int[] input2) {
        long sum1 = 0;
        long sum2 = 0;
        long sum = 0;
        int i = 0;
        int j = 0;
        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                sum1 += input1[i];
                i++;
            } else if (input1[i] > input2[j]) {
                sum2 += input2[j];
                j++;
            } else {
                sum += Math.max(sum1, sum2) + input1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < input1.length) {
            sum1 += input1[i];
            i++;
        }
        while (j < input2.length) {
            sum2 += input2[j];
            j++;
        }
        sum += Math.max(sum1, sum2);
        return sum;

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] input1 = new int[n];
            for (int i = 0; i < n; i++) {
                input1[i] = s.nextInt();
            }
            int m = s.nextInt();
            int[] input2 = new int[m];
            for (int i = 0; i < m; i++) {
                input2[i] = s.nextInt();
            }
            System.out.println(maximumSumPath(input1, input2));
        }
    }
}
