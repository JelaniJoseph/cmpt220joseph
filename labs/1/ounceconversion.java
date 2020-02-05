import java.util.Scanner;

public class ounceconversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for ounces: ");
        double ounces = input.nextDouble();
        double gram = ounces * (28.3495);
        System.out.println(ounces + " ounces is " + gram + "grams");
    }
}
