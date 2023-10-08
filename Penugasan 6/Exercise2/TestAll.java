package Exercise2;


public class TestAll {
    public static void main (String[] args) {
        System.out.println("==========================================================");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea() + " Perimeter: " + c1.getPerimeter());
        Circle c2 = new Circle(25.0);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea() + " Perimeter: " + c2.getPerimeter());
        Circle c3 = new Circle(34.0, "Blue", false);
        System.out.println(c3);
        System.out.println("Area: " + c3.getArea() + " Perimeter: " + c3.getPerimeter());
        System.out.println("==========================================================");

        System.out.println("==========================================================");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea() + " Perimeter: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(14,19);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea() + " Perimeter: " + r2.getPerimeter());
        Rectangle r3 = new Rectangle(34,99,"Brown",false);
        System.out.println(r3);
        System.out.println("Area: " + r3.getArea() + " Perimeter: " + r3.getPerimeter());
        System.out.println("==========================================================");

        System.out.println("==========================================================");
        Square s1 = new Square();
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea() + " Perimeter: " + s1.getPerimeter());
        Square s2 = new Square(55);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea() + " Perimeter: " + s2.getPerimeter());
        Square s3 = new Square(94,"Yellow",false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea() + " Perimeter: " + s3.getPerimeter());
        System.out.println("==========================================================");
    }


}
