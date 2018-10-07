/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Teszt {
    public static void main(String[] args) {
         Triangle h1=new Triangle(1,1.5,1);
         h1.setColor("yellow");
         System.out.println(h1.toString());
         System.out.println("terület: "+h1.getArea());;
         System.out.println("kerület: "+h1.getPerimeter());
         System.out.println("színe: "+h1.getColor());
         System.out.println("töltve van?: "+h1.isFilled());
       
    }
   
   
    
    
}
