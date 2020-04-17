public abstract class Shape {
    public String shapeName;
    
    public String toString() {
        return "The shape is " +shapeName;
    }
    public void setShapeName (String shapeName) {
        this.shapeName = shapeName;
    }
    public abstract double area() ;
    


}
