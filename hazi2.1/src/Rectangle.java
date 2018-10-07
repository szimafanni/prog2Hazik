/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author Fanni
 */
public class Rectangle extends GeometricShape {
    public double width;
    public double height;

    public Rectangle() {
    }

      public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    
}
    
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

        public double getPerimeter(){
        return (width+height)*2;
        
    }
       
           public double getArea(){
        return width*height;
        
    }


}