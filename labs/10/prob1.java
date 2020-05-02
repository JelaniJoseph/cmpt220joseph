import java.util.*;
import java.io.*;

public class prob1{

    public static void main(String[] args) throws Exception {
		// Check if file exists
		File file = new File("Hello_World.txt");
		if (file.exists()) {
			System.out.println("File already exists!");
			System.exit(0);
		}

		try (PrintWriter output = new PrintWriter(file);){
			// Write 100 integers created randomly to file
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		// Crate array list
		ArrayList<Integer> list = new ArrayList<>();

		try(
			Scanner in = new Scanner(file);
		) {
			// Read data from the file
			while (in.hasNext()) {
				list.add(in.nextInt());
			}
		}

		// Sort array list
		Collections.sort(list);

		// Display data in increasing order
		System.out.print(list.toString());
		System.out.println();
	}
}

