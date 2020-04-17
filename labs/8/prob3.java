

class Sphere extends Shape {
    private double radius;
    public Sphere () {
    }
    public Sphere (double radius) {
        this.radius = radius;
    }
    public Sphere (double radius, String shapeName) {
        this.radius = radius;
        setShapeName(shapeName);
    }
    public double getRadius() {
        return radius;
    }
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
}

class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle() {
    
    }
    
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle (double length, double width, String shapeName) {
        this.length = length;
        this.width = width;
        setShapeName(shapeName);
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth () {
        return width;
    }
    
    
    public double area() {
        return length * width;
    }
    
    
}

class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder() {
    
    }
    
    public Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String shapeName) {
        this.radius = radius;
        this.height = height;
        setShapeName(shapeName);
    
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    
}



class prob3 {
    public static void main(String[] arg) {

        String sphere = "sphere";
        Sphere s = new Sphere (18, sphere);

        System.out.println(s.toString() +" with a radius of " + s.getRadius ());
        System.out.println("You would need " + s.area() +" paint to paint the sphere.");

        String rectangle = "rectangle";
        Rectangle r = new Rectangle(10, 30, rectangle);

        System.out.println(r.toString() + " with a length of " +r.getLength() + " and a width of " + r.getWidth());
        System.out.println("You would need " + r.area() + " paint to paint the rectangle.");

        String cylinder = "cylinder";
        Cylinder c = new Cylinder(20, 25, cylinder);

        System.out.println(c.toString() + " with a radius of " + c.getRadius() + " and a height of " +c.getHeight());
        System.out.print("You would need " +c.area() + " paint to paint the rectangle. ");
    }

}

