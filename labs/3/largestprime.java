public class largestprime{
    public static void main(String[] args){
        int n;

        for(n=14999;n>0;n--){
            int c=0;
            for(int i=1;i<=n;i++){
                if(n% i ==0){
                    c++;
                }
            }
            if (c == 2){
                break;
            }
        } 
        System.out.println("Largest n  prime number that is  less than 15000 is "+n);
        
        }
}