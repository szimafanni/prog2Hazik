/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */

public class main {   
       public static boolean isConsecutiveFour(int[] values)
            {
        if(values.length <4) 
            {
               return false;
                }
        else{
            int igaz=0;
            for(int i=3;i<values.length;i++){
            if(values[i-3] == values[i-2] && values[i-2] == values[i-1] && values[i-1] == values[i])
                  {
                     igaz=1;
                     }
                     }
                 if(igaz==1){
                    return true;
            }
            else 
                  return false;
          
}
    
} 

    public static void main(String[] args) {
            int[] tömb = new int[]{4,5,5,5,1,1};

            
            if(isConsecutiveFour(tömb) == true) 
            { 
                System.out.println("van 4 szám");}
            else
            { 
                System.out.println("nincs 4 szám");
 
 
    } 
   
     
     
}   
    

}