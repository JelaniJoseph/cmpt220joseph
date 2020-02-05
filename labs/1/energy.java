import java.util.Random;
import java.util.Scanner;

public class energy {
    public static void main(String[] args){
        System.out.print("Enter mass in kilograms: ");
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double c =  299972458;
        double e = m *c * c;
        System.out.println("The energy for the mass:" + m + " is exactly:" + e);
    }
}
