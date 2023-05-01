//Sample Input 1:
//5
//Sample Output 1:
//1 2 3 4 5 5 4 3 2 1
//1 2 3 4 * * 4 3 2 1
//1 2 3 * * * * 3 2 1
//1 2 * * * * * * 2 1
//1 * * * * * * * * 1

package patterns;

public class NumberStarPattern {

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(j);
                j = j + 1;
            }
            int k = 1;
            while (k <= 2 * i - 2) {
                System.out.print("*");
                k = k + 1;
            }
            int l = n - i + 1;
            while (l >= 1) {
                System.out.print(l);
                l = l - 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
