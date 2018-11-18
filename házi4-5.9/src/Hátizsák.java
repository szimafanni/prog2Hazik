
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Hátizsák implements Comparable  <Hátizsák> {
    public String márka;
    public double űrtartalom;
    public int zsebekSzáma;
    public boolean vízhatlan;

    public Hátizsák() {
    }
    

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }
    
    
    public boolean isVízhatlan(){
        return false;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k " + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSz\u00e1ma=" + zsebekSzáma + ", v\u00edzhatlan=" + vízhatlan ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Hátizsák))
            return false;
        
            Hátizsák ha = (Hátizsák) obj;
            
            return this.márka.equals(ha.getMárka());

    }
    
    
    
    
    @Override
    public int compareTo(Hátizsák o) {
            if( this.márka.equals(o.getMárka())){

            }return 0;
}        
    
}
