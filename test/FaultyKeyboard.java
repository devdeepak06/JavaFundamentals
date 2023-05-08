/*Faulty Keyboard
Send Feedback
Some of the keys on your keyboard are faulty. 
When you press a key, it may register more than once. 
That means if you want to type "code", the keyboard may interpret it as "code", "cccoddee" or "coode" or "codeeeee", etc. 
So, by pressing the keys C, O, D, and E in that order, you may get any of the above-mentioned words.
However, there are certain words that you will not get like, "cddde", "cod", "coeeeeed", etc.
You will be given 'N' pairs of words. 
The first word of each pair is what you intended to write and the second one is what the keyboard interprets it as. 
You need to figure out whether the second word can actually be a possible interpretation of the first word.
Input format
The first line of the input contains a positive integer, N which represents the number of pairs of words Every two lines after it will contain two words. 
The first one is what you typed, the second one is a potential interpretation of that word by the faulty keyboard.
Output format
The output will contain 'N' lines. 
Each line will be either "true" if the second word is a possible interpretation of the first word and "false" if it's not.
Constraints
1 <= N <= 10^5
1 <= L <= 10^6
where L is the total number of letters in all of the 2*N words
Time limit: 1 sec
Sample Input 1
2
code
cooodeee
hello
hheeeloo
Sample Output 1
true
false */
package tests;

import java.util.Scanner;

public class FaultyKeyboard {
    public static boolean isPossible(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;

        }
        int i = 0, j = 0;
        while (i != str1.length() && j != str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;

            } else if (i > 0 && str1.charAt(i - 1) == str2.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        while (j < str2.length()) {
            if (str2.charAt(j) != str1.charAt(i - 1)) {
                return false;
            }
            j++;
        }
        return i < str1.length() ? false : true;
    }

    public static void main(String[] args) {
        // Write your code here

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                String str1 = s.next();
                String str2 = s.next();
                boolean result = isPossible(str1, str2);
                System.out.println(result);
            }
        }
    }
}
