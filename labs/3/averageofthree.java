import java.util.Scanner;

public class averageofthree{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();
        System.out.print("The average is: " + average(a,b,c));

    }
    public static double average(double a, double b, double c){
        return (double)(a + b + c)/3;
    }
}
