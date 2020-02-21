import java.util.Scanner;

public class positivesequence {
    public static void main(String[] args) {
        int count = 0;
        int evennum = 0;
        int sum = 0;
        int input;
        double average;

        System.out.print("Enter a range of integers, (0 to stop): ");
        Scanner in = new Scanner(System.in);

        while ((input = in.nextInt()) != 0) {
                count++;
                sum = input + sum;

            if (input % 2 == 0) {
                evennum = evennum + 1;
            }
        }
        average = (double)sum / count;
        System.out.println("The average value is: " + average);
        System.out.println("even numbers entered is " + evennum);
        System.out.println("Total sum: " +sum);
    }
;
}