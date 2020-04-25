// JA: Remember that classes are capitalized. Where is main?
public class testcylinder {
    public static class Circle{
        //attributes
        double radius = 1.0;
        String color = "red";
        //list of different methods
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[Radius=" + radius + ", Color=" + color + "]";
    }

    // cylinder class
    }
    public class Cylinder extends Circle {
        private double height = 1.0;
        
        public Cylinder() {
        }
        
        public Cylinder(double radius) {
            setRadius(radius);
        }
        
        public Cylinder(double radius, double height) {
            setRadius(radius);
            this.height = height;
        }
        
        public Cylinder(double radius, double height, String color) {
            setRadius(radius);
            this.height = height;
            setColor(color);
        }
        
        public double getHeight() {
            return height;
        }
        
        public void setHeight(double height) {
            this.height = height;
        }
        
        public double getVolume() {
            return getArea() * height;
        }
    }

}
