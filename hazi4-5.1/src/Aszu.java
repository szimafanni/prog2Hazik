/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Aszu extends Bor {
    public int puttyonSzam;

    
    
    public Aszu(int puttyonSzam, String szoloFajta, String termoTerulet, String iz, double alhoholTartalom) {
        super(szoloFajta, termoTerulet, iz, alhoholTartalom);
        this.puttyonSzam = puttyonSzam;
    }
    
    public int hanyPuttonyos(){
        return 0;
        
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttyonSzam=" + puttyonSzam + '}';
    }
    
    
    
}
