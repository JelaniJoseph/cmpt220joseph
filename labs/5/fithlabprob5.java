import java.util.Scanner;
public class fithlabprob5 {
    public static void main(String[] arg) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Size of Matrix: ");
        int limit = in.nextInt();
        int[][] matrix = new int[limit][limit];
        System.out.println("Input desired matrix numbers:  ");

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                System.out.print("Input number: ");
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < limit; i++) {
            int count = 0;
            for (int j = 0; j < limit; j++) {
                System.out.print(matrix[i][j] + "  ");
                count++;
                if (count == 3) {
                    System.out.println();
                }
            }
        }

        System.out.println("========================");

        for (int i = 0; i < limit; i++) {
            int count = 0;
            for (int j = 0; j < limit; j++) {
                System.out.print(matrix[j][i] + "  ");
                count++;
                if (count == 3) {
                    System.out.println();
                }
            }

        }
    }
}