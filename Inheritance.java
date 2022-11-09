/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dav.edu.thirdsem.ninethlab;

/**
 *
 * @author user
 */
public class Inheritance {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        //storing values to parent class properties
        rect.length = 10.00;
        rect.breadth = 20.00;
        
        double area = rect.area;
        double perimeter = rect.perimeter;
        
        
        //accessing parent class properties in child
        rect.showInfo();
        //accessing properties
        System.out.println("Area ="+rect.calculateArea());
        System.out.println("Perimeter= "+rect.perimeter());
        
        
        //Area of triangle
        Triangle tri = new Triangle();
        tri.base= 0;
        tri.height= 0;
        tri.a=0;
        tri.b=0;
        tri.area = 0;
        //accessing the parent class properties
        tri.showInfo();
        
        //storing the value in self i.e. class properties
        tri.base=12;
        tri.height = 20;
        tri.a=5;
        tri.b=6;
        
        
        //accessing the properties
        System.out.println("area: "+ tri.areaOfTriangle());
        System.out.println("perimater: "+ tri.perimeterOfTriangle());
    }
}
