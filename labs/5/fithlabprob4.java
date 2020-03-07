import java.util.Scanner;
import java.util.Arrays;

public class fithlabprob4{
    public static void main(String[] args){

        System.out.println("Enter first array (first number is the limit for the array): ");
        Scanner in = new Scanner(System.in);
        System.out.println("Input length of array:");
        int count = in.nextInt();
        // first array created with the length being count variable 
        int[] firstarray = new int[count];

        // loop that goes through array and stops once limit of count has been reached
        for (int i = 0; i < count; i++) {
            System.out.print("Input number for 1st array: ");
            firstarray[i] = in.nextInt();
        }
        // tells user that array length set in first array carries over to this one
        System.out.println("Length is still the same as first array");
        // alerts user that the second array is now starting 
        System.out.println("Second array.");
        int [] secondarray = new int[count];

            // nested for loop to input second array 
            for (int j = 0; j < count; j++) {
                System.out.print("Input number: ");
                secondarray[j] = in.nextInt();
            }
        
        System.out.print(equal(firstarray, secondarray));
    }

    // method to sort both array lists and then return it to code
    public static boolean equal(int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        // returns boolean to see if values are actual equivalent to one another
        return Arrays.equals(x, y);
    }
 
}