/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dav.edu.thirdsem.ninethlab;

public class Square extends Area {
    
    public double length;
    //@ is use to denote the parent class function is override which is called annotation
    @Override
    public void area(){
        double area = this.length*this.length;
        System.out.println("Area of Square: "+ area);
        
    }
    
}
