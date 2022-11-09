package com.dav.edu.thirdsem.ninethlab;


public class Triangle extends Shape {
    public double a;
    public double b;
    public double base;
    public double height;
    
    public double areaOfTriangle(){
        this.area= 0.5*this.base*this.height;
        return this.area;
    }
    public double perimeterOfTriangle(){
        this.perimeter = this.base+this.a+this.b;
        return this.perimeter;
    }
}
