// package strings;
//You are given a binary string S, containing only zeros and ones.
//Your task is to determine the total number of substrings starting having only ones.
//For example, if S = "1101", then the answer is 4.
//Explanation: The substrings are "1", "11", "110", "1101".
//Sample Input 1:
//1101
//Sample Output 1:
//4


package string;

public class OneStrings {

    public static int findOneStrings(String str) {
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '1') {
                int j = i + 1;
                while (j < str.length() && str.charAt(j) == '1') {
                    j++;
                }
                int len = j - i;
                count += (len * (len + 1)) / 2;
                i = j;
            } else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "1101";
        System.out.println(findOneStrings(str));
        
    }
}