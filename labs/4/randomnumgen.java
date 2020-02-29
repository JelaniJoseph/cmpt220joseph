import java.util.Arrays;
public class randomnumgen {
    public static void main(String[] arg) {
        int numarray[] = new int [1000];
        for(int i=0; i<1000; i++) {
            numarray[i] = (int)(Math.random()*1000);
        }
            Arrays.sort(numarray);
        for(int j=0; j<1000; j++) {
            System.out.print(numarray[j]+" ");
        }
    }
}