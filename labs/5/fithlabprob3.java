import java.util.Scanner;
public class fithlabprob3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //enter the number of students for program
        System.out.print("Enter how many students: ");
        String[] students = new String[in.nextInt()];
        int[] scores = new int[students.length];
        

        //user input is stored to two seperate 1d arrays 
        for (int i = 0; i < students.length; i++){
            System.out.print("Student " + (i + 1) + ": ");
			students[i] = in.next();
			System.out.print("Score: ");
			scores[i] = in.nextInt(); 
        }

        //calls sort method
        ascending(students, scores);

        //prints the array for user to see
        for (String e: students) {
			System.out.println(e);
		}
    }

    public static void ascending(String[] student, int[] scores){
        for (int i = 0; i < scores.length; i++){
            int least = scores[i];
            int index = i;
            String temp;
            
            //gets the lowest number out of the array 
            for (int j = 0; j< scores.length; j++){
                // if score is lower than current score make least = to it
                if (scores[j] > least) {
					least = scores[j];
					index = j;
				}
            }
        }
    }

}