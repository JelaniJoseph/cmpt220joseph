import java.util.Scanner;

public class twonumbers {
    public static void main(String[] args){
        //Created scanner
        Scanner input = new Scanner(System.in);
        //Allowed user to add input for two numbers and assigned them to variables
        System.out.print("Enter a number:");
        double x = input.nextDouble();
        System.out.print("Enter a second number:");
        double y = input.nextDouble();
        // Created a boolean variable to check input variables to conditionals then print true or false
        boolean situation;

        situation = (x<y);
        System.out.println(x + " is less than " + y + "? " + situation);
        situation = (x<=y);
        System.out.println(x + "is less than or equal to " + y + "? " + situation);
        situation = (x==y);
        System.out.println(x + "is equal to " + y + "? " + situation);
        situation = (x!=y);
        System.out.println(x + "is not equal to " + y + "? " + situation);
        situation = (x>y);
        System.out.println(x + "is greater then" + y + "? " + situation);
        situation = (x>=y);
        System.out.println(x + " is greater than or equal to " + y + "? " + situation);

    }
}
