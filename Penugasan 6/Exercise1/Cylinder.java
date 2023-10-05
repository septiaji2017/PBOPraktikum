package Exercise1;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return getRadius()*getHeight()*(2*Math.PI) + (2*super.getArea());
    }

    public double getVolume() {
        return super.getArea()*height; //getArea nya ngambil dari si Circle.java, karena make kata kunci super.getArea()
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }

}
