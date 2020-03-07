import java.util.Scanner;

public class fithlabprob1{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
        System.out.print(max(numbers));
    }

    public static double max(double[] array){
        double max = array[0];
		for (double i: array) {
			if (i > max)
				max = i;
		}
		return max;
	}

}