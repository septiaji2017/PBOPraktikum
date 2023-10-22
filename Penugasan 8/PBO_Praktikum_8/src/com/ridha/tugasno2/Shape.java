package com.ridha.tugasno2;

abstract public class Shape {
    protected String shapeName;
    public Shape(String pShapeName) {
        shapeName = pShapeName;
    }
    abstract double area();
    public String toString() {
        String result = "Shape Name: " + shapeName + "\n";
        return result;
    }
}
