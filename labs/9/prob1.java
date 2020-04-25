import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		// method to get array
		int[] array = getArray();

		// user enters array index here
		System.out.print("Enter  index of array: ");
		try {
			// Display current value
			System.out.println("The current value is " + 
				array[in.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}
    //Returns an array with 100 randomly chosen integers
    
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}

}