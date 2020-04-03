public class lab6num1{
    // class named square
    public static class Square{
        // creation of double variable width
        public double width;
        // no arg constructor that sets default value of width to 1
        Square(){
            width = 1;
        }
        // constructor that allows specified width for square
        Square (double w){
            width = w;
        }
        double getArea(){
            return width * width;
        }
        double getPerimeter(){
            return 4*width;
        }
    }


    public static void main(String[] args){
        // two instances of different width squares
        Square s1=new Square(5);
        System.out.println("width: " + s1.width);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        Square s2=new Square(10);
        System.out.println("width: " + s2.width);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

    }

   
}
