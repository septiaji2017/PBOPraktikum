package Exercise2;

public class Square extends Rectangle {
    //katakunci super() digunakan untuk constructor
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }

    @Override
    public double getArea(){
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() + " which is sublclass of " + super.toString();
    }

}
