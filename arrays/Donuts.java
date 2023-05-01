/*Ninja loves eating donuts. He consumes 4 donuts per day. When he eats 4 donuts such that their weight is w1 <= w2 <= w3 <= w4 , he gains weight w2 (second minimum value in the group).
You are given an array that contains the weight of n donuts. Your task is to determine the maximum total weight Ninja can gain by eating the donuts optimally each day.
Note: n is always a multiple of 4
Example:
Sample Input 1:
8
1 9 4 10 6 18 4 5
Sample Output 1:
13
Explanation:
Ninja eats donuts in the following manner:
Day 1: 1 4 4 5
Day 2: 6 9 10 18
Total weight gained = 4 + 9 = 13
Sample Input 2:
12
3 4 10 19 17 23 6 6 12 5 20 27
Sample Output 2:
38
Explanation:
Ninja eats donuts in the following manner:
Day 1: 3 5 6 6
Day 2: 10 12 17 19
Day 3: 20 23 27 27
Total weight gained = 6 + 19 + 13 = 38


*/

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Donuts {

    public static int maxWeight(int[] weights) {
        Arrays.sort(weights);
        int n = weights.length;
        int totalWeight = 0;
        for (int i = 0; i < n; i += 4) {
            int min = Math.min(Math.min(weights[i], weights[i + 1]), Math.min(weights[i + 2], weights[i + 3]));
            int secondMin = Integer.MAX_VALUE;
            for (int j = i; j < i + 4; j++) {
                if (weights[j] > min && weights[j] < secondMin) {
                    secondMin = weights[j];
                }
            }
            totalWeight += secondMin;
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        // int[] weights = { 1, 9, 4, 10, 6, 18, 4, 5 };
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] weights = new int[n];
                for (int i = 0; i < n; i++) {
                    weights[i] = sc.nextInt();
                }
                System.out.println(maxWeight(weights));
            }
        }
    }

}
