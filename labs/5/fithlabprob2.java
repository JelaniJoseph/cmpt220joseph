import java.util.Scanner;

public class fithlabprob2{

    public static double mean(double[] x) {
        double sum = 0, mean = 0, len = x.length;
        for (double n : x){
            sum += n;
            mean = sum / len;
        }
        return mean;
    }
    
    public static double deviation(double x[]) {
        double sqDiff = 0, len = x.length;
        double mean = mean(x);
        for (int i = 0; i < len; i++){
            sqDiff += (x[i] - mean) * (x[i] - mean);
        }
        return Math.sqrt(sqDiff / len);
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double array[] = new double[10];
        System.out.print("Enter 10 integers:");

        for (int i = 0; i < 10; i++){
            array[i] = in.nextDouble();
        }

        System.out.println("Mean : " + mean(array));

        System.out.println("Standard Deviation: " + deviation(array));
    }

   
}
