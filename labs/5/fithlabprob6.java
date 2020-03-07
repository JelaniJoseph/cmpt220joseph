import java.util.Scanner;

public class fithlabprob6{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a two-dimensional array (no zeros) (## ##,): ");
        // reads the next user input on the input line
        String userinput = in.nextLine();
        // splits the user input by the ","
        String[] split = userinput.split(", ");
        
        // creates a double array that sets the first array to the split length, and the next to a max of 100
        double[][] numArray = new double[split.length][100];
        
        // loop goes through and makes a new string array from the old array then seperates it by the  space
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(" ");
            for (int j = 0; j < split2.length; j++) {
                numArray[i][j] = Double.parseDouble(split2[j]);
            }
        }
        
        System.out.println("Enter the index of  row you would like to find average of: ");
        int rowIndex = in.nextInt();
        double average = averageRow(numArray, rowIndex);
        System.out.println("The average of the values is " + average);
    }
    
    public static double averageRow(double[][] array, int row) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
            if (array[row][i] != 0) {
                count += 1;
            }
        }

        return (double) sum / count;
    }
}