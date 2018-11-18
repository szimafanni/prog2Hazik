
package ital;

import java.util.Objects;

/**
 *
 * @author Fanni
 */

public class Ital implements Comparable{

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    @Override
    public String toString() {
        return "<név>" + név + " <kiszerelés>" + kiszerelés + " <ár>" + ár +" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Ital))
                return false;
        
        Ital ital=(Ital)obj;
        return this.név==ital.getNév()&& this.kiszerelés==ital.getKiszerelés();
        
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    
    
    
    
}
