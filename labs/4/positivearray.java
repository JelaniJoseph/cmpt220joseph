public class positivearray {

    public static void main(String[] args) {
        int[] arrayOfNums = new int [20];
        arrayOfNums = addAtEnd(arrayOfNums);
        int num = 10; 
        int pos = 3;
        arrayOfNums = addAtPos(arrayOfNums, num, pos); 
        num = 100; 
        pos = 7;
        arrayOfNums = addAtPos(arrayOfNums, num, pos); 
        System.out.println("\nNew array: ");
        for (int i = 0; i < 13; i++) {
            if (i < 12) {
                System.out.print(arrayOfNums[i] + ", ");
            }
            else {
                System.out.println(arrayOfNums[i]);
            }
        }
    }
    
    public static int[] addAtEnd(int[] arrayOfNums) {
        System.out.println("Original array: ");
        for (int i = 0; i < 10; i++) {
            arrayOfNums[i] = i + 1;
            System.out.print(arrayOfNums[i] + ", ");
        }
        arrayOfNums[arrayOfNums.length - 1] = -1;
        System.out.print(arrayOfNums[arrayOfNums.length - 1] + "\n");
        return arrayOfNums;
    }
    
    public static int[] addAtPos(int[] oldArray, int num, int pos) {
        int[] newArray = new int[20];
        for (int i = 0; i < oldArray.length; i++) { 
            if (i < pos - 1) 
                newArray[i] = oldArray[i]; 
            else if (i == pos - 1) 
                newArray[i] = num; 
            else
                newArray[i] = oldArray[i - 1]; 
        }
        newArray[12] = -1;
        return newArray; 
    }
}