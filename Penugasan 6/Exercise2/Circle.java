package Exercise2;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(Double radius){
        super();
        this.radius = radius;
    }

    public Circle(Double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + " which is sublclass of " + super.toString();
    }
}
