package arrays;

import java.util.Scanner;

public class PrintArrays {
//Sysntax to store array elements in an array
//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++) {
//         arr[i] = sc.nextInt();
//     }
//     System.out.println();
// }
//print the array elements
// for (int i = 0; i < n; i++) {
//     System.out.println(arr[i]);
// }
// }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println();
        }

    }

}
