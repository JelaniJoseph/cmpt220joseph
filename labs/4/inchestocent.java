import java.math.RoundingMode;
import java.text.DecimalFormat;
public class inchestocent {
    public static void main(String[] arg) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        int inches = 1;
        double cent1 = (inches + 1.54);
        double cent = cent1;
        int cm = 1;
        double in = (cm / 2.54);
        System.out.print("in          cm | cm        in \n -------------------------- \n");
        for(int i = 0; i < 50; i++) {
            System.out.println(inches +"        " + df.format(cent) +   "  |  "  + df.format(cm)   + "     " + df.format(in));
            cent = cent + 2.54;
            inches++;
            cm = cm + 5; 
            in = cm / 2.54;
        }
    }
}