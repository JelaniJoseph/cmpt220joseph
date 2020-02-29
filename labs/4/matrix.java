import java.util.Scanner;
import java.util.Random;
public class matrix {
    public static void main(String[] arg) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 25; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            System.out.print(c + " ");
            counter = counter + 1;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
      } 
}