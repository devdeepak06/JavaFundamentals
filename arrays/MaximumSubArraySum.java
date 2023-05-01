package arrays;

public class MaximumSubArraySum {
    public static int maxSubArraySum(int[] arr) {
        int max = arr[0];
        int maxSum= arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxSum = Math.max(arr[i], maxSum + arr[i]);
            max = Math.max(max, maxSum);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = { 34, -50, 42, 14, -5, 86 };
        System.out.println(maxSubArraySum(arr));
    }
}
