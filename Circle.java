/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dav.edu.thirdsem.ninethlab;


public class Circle extends Perimeter {
    public double pi = 3.17;
    public double radius;
    @Override
    public void perimeter(){
        double perimeter= 2*this.pi*this.radius;
    }
    
    
}
