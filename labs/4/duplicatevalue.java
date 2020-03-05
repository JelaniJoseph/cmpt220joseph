import java.util.Scanner;

public class duplicatevalue{
    public static void main(String args[]){

        Scanner in =new Scanner(System.in);
        int size,i=0,j=0;
        System.out.print("Enter array size : ");

        size=in.nextInt();
        int[] array=new int[size+1];
        array[size]=-1;

        System.out.print("Enter elements : ");
        while(i<size){
            array[i]=in.nextInt();
            i++;
        }

        i=0;
        j=0;

        while(array[i]!=-1){
            j=0;
            while(array[j]!=-1){
                //if duplicate found
                if(array[i]==array[j] && i!=j){
                    int k=j;
                    //deletes duplicate
                    while(array[k]!=-1){ // JA: This goes into an infinite loop
                        array[k]=array[++k];
                        //updates array
                        array[k-1]=-1;
                    }
                    j++;
            }   }
            i++;
        }
        //prints array to user
        System.out.print("Sorted Array :\n\t");
        //loop to print array
        i=0;
        while(array[i]!=-1){
            System.out.print(""+array[i]+", ");
            i++;
        }
    }
}