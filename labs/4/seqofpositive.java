import java.util.Scanner;

public class seqofpositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, input;
        int seq[] = new int[100]; 
        System.out.println("Enter positive numbers and 0 to end: ");
        //read first value
        input = sc.nextInt();
        //read till value is 0 and n is less than 100
        while(input != 0 && n<100){
            seq[n] = input; 
            n++;
            input = sc.nextInt();
        }

        for (int i=1; i<n; ++i){
            int cur = seq[i]; 
            int j = i-1;
            while (j>=0 && seq[j] > cur){
                seq[j+1] = seq[j];
                j = j-1;

            }
        seq[j+1] = cur; 
        }
        System.out.print("Sorted values: ");

        for(int i=0; i<n; i++){
            System.out.print(seq[i] + " ");
            System.out.println();
            sc.close();
        }
    }

}