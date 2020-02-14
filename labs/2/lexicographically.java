import java.util.Scanner;

public class lexicographically {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String first = input.nextLine();

        System.out.print("Enter another string: ");
        String second = input.nextLine();

        int result = first.compareTo(second);

        //Statement tells user which is lexicographically greater and then places in
        if (result < 0 ){
            System.out.println("the string: " + first + " is lexicographically greater than " + second);
            System.out.println("In Ascending Order: ");
            System.out.println(first);
            System.out.println(second);
        }
        else if(result > 0 ){
            System.out.println("The string: " + first + " is lexicographically less than " + second);
            System.out.println("In Ascending Order: ");
            System.out.println(second);
            System.out.println(first);
        }
        else if (result == 0){
            System.out.println("Both the string: " + first + " and "+ second + " are lexicographically equal");
            System.out.println("Both strings are equal, so there is no ascending order ");
        }


    }
}
