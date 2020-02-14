import java.util.Scanner;

public class inputtoint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // prompts user for input and converts it into the ascii value
        System.out.print("Enter a letter (a-z): ");
        char first = input.next().charAt(0);

        System.out.print("Enter another letter (a-z): ");
        char second = input.next().charAt(0);

        // adds both inputs together and returns the result to user
        System.out.println(first + second);
    }

}
