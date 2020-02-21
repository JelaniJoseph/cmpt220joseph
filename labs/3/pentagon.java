public class pentagon{
    public static void main(String[] args){
        int count = 0;
        for(int i = 1; i <= 50; i++){
            System.out.print(pent_formula(i) + " ");
            count ++;
            if (count % 10 == 0){
                System.out.println(" ");
            }
        }
    }
    public static int pent_formula(int i){
        return (i * (3 * i - 1))/2;
    }
}