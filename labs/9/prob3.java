import java.util.Scanner;

public class prob3 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input  integer to be converted into a Decimal (1s or 0s): ");
        String binaryString = input.next();

        try {
            System.out.print(bin2Dec(binaryString));
        } catch(NumberFormatException e) {
            System.out.print(e);
        }
    
        }
    
    public static int bin2Dec (String binaryString) {
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) <'0' || binaryString.charAt(i) > '1') {
                throw new NumberFormatException("Input is not a binary number!");
            }
            decimal += (binaryString.charAt(i) - '0') * Math.pow(2, binaryString.length()-1-i);
        }
        return decimal;
    }

}