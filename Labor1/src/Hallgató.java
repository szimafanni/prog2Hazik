/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgató {
    
    String név;
    String nkód;     //tulajdonságai a hallgatónak//
    double átlag;
    int évfolyama;

    public Hallgató(String név, String nkód, int évfolyama) {  //konstruktor,függvény//
        this.név = név;
        this.nkód = nkód;
        this.évfolyama = évfolyama;
    }
    
    
    
    
    public void köszön(Hallgató kinek)  //viselkedés, metódus//
           
    {
        
        System.out.println("Jó napot!"+" "+ kinek.getNév());
                            //a hallgató tud köszönni más hallgatónak
        
    }
    
    public String getNév() //függvény, van visszatérési értéke!!!//
    {
        return név;
    }
}
