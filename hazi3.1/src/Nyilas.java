/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Nyilas extends Katona {
    private int lőtáv;

    public Nyilas(int lőtáv, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lőtáv = lőtáv;
        tamadoero=tamadoero+lőtáv;
    }

    public Nyilas(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    
    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas "+super.toString() + " lőtáv " + lőtáv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.lőtáv;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       return super.equals(obj) &&
               this.lőtáv==getLőtáv();
    }
    
    
    
    
    
    
    
}
