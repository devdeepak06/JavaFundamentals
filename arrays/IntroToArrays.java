package arrays;

public class IntroToArrays {
    // public static void main(String[] args) {

    //     // syntax to store array elements in an array
    //     // int[] arr = new int[n];
    //     // for (int i = 0; i < n; i++) {
    //     // arr[i] = sc.nextInt();
    //     // }
    //     // System.out.println();
    //     // }
    //     //new is used to create an object of array
    //     //int[] is data type of array
    //     int[] arr; // declaration
    //     arr = new int[5]; // initialization
    //     arr[0] = 10; // initialization
    //     arr[1] = 20; // initialization
    //     arr[2] = 30; // initialization
    //     arr[3] = 40; // initialization
    //     arr[4] = 50; // initialization

    //     // printing array elements
    //     System.out.println(arr[0]);
    //     System.out.println(arr[1]);
    //     System.out.println(arr[2]);
    //     System.out.println(arr[3]);
    //     System.out.println(arr[4]);

    //     // printing array elements using for loop
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();

    //     // printing array elements using for each loop
    //     for (int element : arr) {
    //         System.out.print(element + " ");
    //     }
    //     System.out.println();

    //     // printing array elements using while loop
    //     int i = 0;
    //     while (i < arr.length) {
    //         System.out.print(arr[i] + " ");
    //         i++;
    //     }
    //     System.out.println();

    //     // printing array elements using do while loop
    //     int j = 0;
    //     do {
    //         System.out.print(arr[j] + " ");
    //         j++;
    //     } while (j < arr.length);
    //     System.out.println();

    //     // printing array elements using for loop in reverse order
    //     for (int k = arr.length - 1; k >= 0; k--) {
    //         System.out.print(arr[k] + " ");
    //     }
    //     System.out.println();

    //     // printing array elements using while loop in reverse order
    //     int l = arr.length - 1;
    //     while (l >= 0) {
    //         System.out.print(arr[l] + " ");
    //         l--;
    //     }

    //     System.out.println();

    //     // printing array elements using do while loop in reverse order
    //     int m = arr.length - 1;
    //     do {
    //         System.out.print(arr[m] + " ");
    //         m--;
    //     } while (m >= 0);

    //     System.out.println();
    // }

    public static void main(String[] args){
        //		try (Scanner sc = new Scanner(System.in)) {
        //			int n = sc.nextInt();
        //			int[] arr1 = new int[n];
                int[] arr = {1,2,3,4,5,6,7,8,9};
                //take input from user
                    // for(int i = 0; i < arr.length; i++){
                    //     arr[i] = i;
                    // }
                    
                    //print
                    for(int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    //using enhanced for loop
                    for(int num : arr){ //for every element in array, print the element
                        System.out.print(num + " "); //here num represents element of the array
        
        //			}
                }
        
            }
                
        
        //    	char[] c = {'H', 'E', 'L', 'L', 'O'};    	
        //    	
        //    	System.out.println(c);
        
        //		String str1 = "Deepak";
        //		String str2 = " Sakya";
        //		str1 = str1.concat(str2);
        //		System.out.println(str1);
        //		System.out.println();
}
