import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of triangle side A: ");
        double sideA = in.nextDouble();
        System.out.println("Enter length of triangle side B: ");
        double sideB = in.nextDouble();
        System.out.println("Enter length of triangle side C: ");
        double sideC = in.nextDouble();
        try {
            Triangle t = new Triangle (sideA, sideB, sideC);
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static class Triangle {
        private double sideA = 1.0;
        private double sideB = 1.0;
        private double sideC = 1.0;
        
        public Triangle() {
        }
        
        public Triangle(double sideA, double sideB, double sideC) 
                throws IllegalTriangleException {
            if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
                throw new IllegalTriangleException();
            }
            else {
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            } 
        }
    }
    
    public static class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
            super("Illegal Triangle Exception: sum of any two sides in a "
                    + "triangle must be greater than the other.");
        }
    }

}