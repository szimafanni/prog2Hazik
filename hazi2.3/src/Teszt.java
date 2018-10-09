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
    private static Kocsma[] adottItaltKínálóKocsmák(String ital,VendéglátóipariEgység[] t){
       int count=0;
       for(int i=0;i<t.length;i++){
           if(t[i] instanceof Kocsma)
           {
               Kocsma kocs=(Kocsma)t[i];
               for(int j=0;j<kocs.getSörlap().length;j++){
                   if(kocs.getSörlap()[j].equals(ital)){
                       count++;
                   }
               }
           }
       }
        Kocsma[] kocsma= new Kocsma[count];
        
        int k=0;
         for(int i=0;i<t.length;i++){
           if(t[i] instanceof Kocsma)
           {
               Kocsma kocs=(Kocsma)t[i];
               for(int j=0;j<kocs.getSörlap().length;j++){
                   if(kocs.getSörlap()[j].equals(ital)){
                       kocsma[k]=kocs;
                       k++;
                   }
               }
           }
       }
       return kocsma;
        }
        
   
        public static void main(String[] args) {
        VendéglátóipariEgység [] t= new VendéglátóipariEgység[]{
            new Étterem("Enni jó",50,new String[]{"Rántott hús","Húsleves","Spagetti"}),
            new Étterem("Falni jó",40,new String[]{"Rántott hal","Májgombócleves","Fagyi"}),       
            new Étterem("Zabálom",60,new String[]{"Rántott gomba","Hagymaleves","Penne"}),    
            new Étterem("Éttermijó",55,new String[]{"Rántott hús","Karalábéleves","Saláta"}),
            new Étterem("Falatozz",30,new String[]{"Rántott gomba","Húsleves","Spagetti"}),
        
            new Kocsma("Inni jó!",30,new String[]{"Soproni","Borsodi","Heineken"}),
            new Kocsma("Itóka",10,new String[]{"Soproni","Staropramen","Dreher"}),
            new Kocsma("Fenékig",20,new String[]{"Soproni","Budweiser","Stella"}),
            new Kocsma("Maciszörp",21,new String[]{"Carlsberg","Pilsner","Heineken"}),
            new Kocsma("Szamóca",25,new String[]{"Hofbrau","Borsodi","Kőbányai"})    
        };
             
        Kocsma[] pub=adottItaltKínálóKocsmák("Soproni", t);
        for(Kocsma kocs:pub)
                System.out.println(kocs);
                
    }


    }

