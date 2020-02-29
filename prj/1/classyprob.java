import java.util.Scanner;
import java.util.Arrays;


public class classyprob{
    public static String storeentry(String [] split2){
        String numrank = "";
        for (int i = split2.length-1; i >= 0; i--){
            if( split2[i].equals("upper")){
                numrank = numrank + "0";
            }else if(split2[i].equals("middle")){
                numrank = numrank + "1";
            }else{
                numrank = numrank + "2";
            }
            
        }
        return numrank;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        
        for (int i = 0; i < c; i++){
            int entries = in.nextInt();
            String [] array = new String [entries];
            //gets rid of extra new line character 
            in.nextLine();
            // reads input and stores it into array
            for (int j = 0; j< entries; j++){
                array[j] = in.nextLine();
                
            }
            String [] finalarray = new String [entries];
            // takes array and splits it into 3 areas, name, rank, and the last one being the word class
            for (int k = 0; k<array.length; k++){
                String [] split1 = array[k].split(" ");
                String [] split2 = split1[1].split("-");
                String numrank = storeentry(split2);
                //makes sure the placement stops at 10, if any blank spaces add 1
                numrank = String.format("%-10s", numrank ).replace(' ', '1');
                numrank = numrank + ":" + split1[0].substring(0, split1[0].length() - 1);
                finalarray[k] = numrank;
            }
            Arrays.sort(finalarray);
            for (int l = 0; l < finalarray.length; l++){
                String split3[] = finalarray[l].split(":");
                System.out.println(split3[1]);
            }
            System.out.println("=============================="); 
        }

    }
}
