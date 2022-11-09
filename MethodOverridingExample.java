/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dav.edu.thirdsem.ninethlab;

/**
 *
 * @author user
 */
public class MethodOverridingExample {
    public static void main(String[] args) {
        //Creating object of child class
        Square s1 = new Square();
        s1.length = 12;
        s1.area();
        Area al = new Area();
        al.area();
        
        //creating the object of the child class 
        Circle cc= new Circle();
        cc.radius = 7;
        cc.perimeter();
        Perimeter pi = new Perimeter();
        pi.perimeter();
        
    }
}
