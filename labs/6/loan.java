import java.lang.Math;
public class loan {
    public static class Bond{
        //specifications of the financial bond 
        public double coupon;
        public double payments;
        public double interest;
        public double valueMaturity;
        //no arg constructor that creates a default bond
        Bond(){
            coupon = 1;
            payments = 1;
            interest = 1;
            valueMaturity = 1;
        }
        // constructor that creates a bond with specified values
        Bond(double c, double n, double i, double m){
            coupon = c;
            payments = n;
            interest = i;
            valueMaturity = m;
        }
        // price equation that should go through the formula and give the result to the user
        double getPrice(){
            return coupon * (1 - ( 1. / (Math.pow(1 + interest, payments)))
             + valueMaturity * (1./(Math.pow(1+interest, payments))) );
        }
    }

    public static void main(String[]args){
        // instances to test the bond class
        Bond s1=new Bond(500, 100, 0.05, 10000);
        System.out.println("Coupon Payment: " + s1.coupon);
        System.out.println("Number of Payments: " + s1.payments);
        System.out.println("Interest: " + s1.interest);
        System.out.println("valueMaturity: " + s1.valueMaturity);
        System.out.println("Price total: " + s1.getPrice());
    }
   

}