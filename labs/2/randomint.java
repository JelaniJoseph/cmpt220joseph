import java.util.*;
public class randomint {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a low limit integer:");
        int min = input.nextInt();
        System.out.print("Enter a max limit integer: ");
        int max = input.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.println(getRand(min, max));
        }
    }

    private static int getRand(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}