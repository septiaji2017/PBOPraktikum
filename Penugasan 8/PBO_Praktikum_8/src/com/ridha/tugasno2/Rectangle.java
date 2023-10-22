package com.ridha.tugasno2;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        super("Rectangle");
        width = w;
        height = h;
    }
    public double area(){
        return width*height;
    }
    @Override
    public String toString() {
        return super.toString() + " of width " + width + " and height " + height;
    }
}
