public class circle {
    public static class Circle {
        //attributes of circle class
        private double x;
        private double y;
        private  double radius;
        
            public Circle(double x, double y, double radius) {
                this.x = x;
                this.y = y;
                this.radius = radius;
            }
        
            public double getX() {
                return x;
            }
            public double getY() {
                return y;
            }
            public double getRadius() {
                return radius;
            }
            public double getArea() {
                return Math.PI * radius * radius;
            }
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }
        
            public boolean overLaps(Circle circle) {
                double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + (Math.pow(circle.getY() - y, 2)));
                double minDistance = Math.max(circle.getRadius(),this.radius) - Math.min(circle.getRadius(),this.radius);
                if (distance <= (this.radius + circle.getRadius())) {
                    if (distance >= minDistance) {
                        return true;
                    }
                }
                return false;
            }

            public boolean contains (Circle circle) {
                double distance = Math.sqrt((Math.pow(circle.getX() - this.getX(), 2) + (Math.pow(circle.getY() - this.getY(), 2) )));
                if (this.getRadius() > (distance + circle.getRadius())) {
                    return true;
                    }
                return false;
            }
        
            public boolean contains(double x, double y) {
                if(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2 ) < Math.pow(this.radius, 2)){
                    return true;
                    }
                return false;
            }

        }
        public static void main(String[] arg) {

            Circle c1 = new Circle(2, 2, 5.5);

            System.out.println("The area is " + c1.getArea());
            System.out.println("The perimeter is " + c1.getPerimeter()) ;
            System.out.println("The point (3, 3) is withing the original circle: " + c1.contains(3, 3));
            System.out.println("The original circle contains the new circle: " + c1.contains(new Circle(4, 5, 10.5)));
            System.out.println("The new circle overlaps the original circle: "  +  c1.overLaps(new Circle(3, 5, 2.5)));
    
        }       

}