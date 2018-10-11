/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Test {
    private static void megKuzd(Katona k1, Katona k2){
       System.out.println("Csata kezdődik: ");
       
        if   (k1.getTamadoero()> k2.getVedoero()){
            System.out.println("\nküzdenek: "+k1+" és "+k2);
            System.out.println("Győztes: "+k1);
        }
            

        if(k2.getTamadoero()>k1.getVedoero()){
            System.out.println("\nküzdenek: "+k1+" és "+k2);
            System.out.println("\nGyőztes: "+k2);
        }

        if(k1.getTamadoero()==k2.getTamadoero()){
            System.out.println("küzdenek: "+k1+" és "+k2);
            System.out.println("Győztes: "+k1);
        }
        System.out.println("\n");
   
    }
    
    
    public static void main(String[] args) {
        Katona ka=new Nyilas(2, 1, 1);
        Katona kat=new Nyilas(3, 2, 2);
        Katona katt=new Landzsas(1500,2000);

        megKuzd(ka, kat);
        megKuzd(ka, katt); 
        megKuzd(kat, katt);
        
        System.out.println("Életben maradt: "+katt);
                    
    }
}
