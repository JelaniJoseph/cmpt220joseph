public class asciiprint{
    public static void main(String[] args){
        for (int i = 0; i <= 100; i++){
            System.out.print(" "+(char)i);
            if(i % 20 == 0){
                System.out.println();
            }
            
        }
    }
}