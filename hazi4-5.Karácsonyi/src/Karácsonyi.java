/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Karácsonyi {
    public String hozzavalo;
    public int mennyiseg;

    public Karácsonyi() {
    }

    public Karácsonyi(String hozzavalo, int mennyiseg) {
        this.hozzavalo = hozzavalo;
        this.mennyiseg = mennyiseg;
    }

    public String getHozzavalo() {
        return hozzavalo;
    }

    public void setHozzavalo(String hozzavalo) {
        this.hozzavalo = hozzavalo;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return "Kar\u00e1csonyi{" + "hozzavalo=" + hozzavalo + ", mennyiseg=" + mennyiseg + '}';
    }
    
    
    
    
    
    
}
