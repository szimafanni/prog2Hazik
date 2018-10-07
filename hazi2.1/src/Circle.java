///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.

import java.util.Date;
/**
 *
 * @author Fanni
 */

public class Circle extends GeometricShape {
    public double radius;
    
    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius=radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
  
   
    
       public double getPerimeter(){
        return 2*radius*Math.PI;
        
    }
       
           public double getArea(){
        return radius*radius*Math.PI;
        
    }
    
        public double getDiameter(){
        return getArea()+getPerimeter()+this.radius;
        
    }
   
}
