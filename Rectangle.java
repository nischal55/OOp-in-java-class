/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dav.edu.thirdsem.ninethlab;

//accessing the property of shape inside class
public class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    public double calculateArea(){
        System.out.println(this.area);
        this.area=this.length*this.breadth;
        System.out.println(this.area);
        return this.area;
    }
    public double perimeter(){
        this.perimeter=2*(this.length+this.breadth);
        return this.perimeter;
    }
}
