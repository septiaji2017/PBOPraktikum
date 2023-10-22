package com.ridha.tugasno2;

public class Sphere extends Shape{
    private double radius;
    public Sphere(double r){
        super("Sphere");
        radius = r;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
