
public class numprint {
    public static void main(String[] args){
        int count = 0;
        int num_line = 10;
        for (int i = 100; i <= 500; i++){
            if (i % 5 == 0 ^ i % 7 == 0){
                count++;
                if (count % num_line == 0){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");	
                }
                
                
            }
        }
        
    }
}
