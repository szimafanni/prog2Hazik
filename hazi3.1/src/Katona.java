/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Katona {
    private int tamadoero;
    private int vedoero;

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public Katona() {
        this.tamadoero=(int) 5.5;
        this.vedoero=(int) 5.5;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "tamadoero= " + tamadoero + ", vedoero= " + vedoero;
   
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.tamadoero;
        hash = 23 * hash + this.vedoero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Katona))
                return false;
        
        Katona kat=(Katona)obj;
        return this.tamadoero==kat.getTamadoero()&& this.vedoero==kat.getVedoero();
    }
    

   
    
    
}
