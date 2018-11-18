
import zh.Dolgozat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Hallgato {
    int mennyitKeszult;
    boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public int isMennyitKeszult() {
        return mennyitKeszult;
    }

    public void setMennyitKeszult(int mennyitKeszult) {
        this.mennyitKeszult = mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }
    
    
    
    public void dolgozatotIr(Dolgozat o){
        
        
    }
    
    
}
