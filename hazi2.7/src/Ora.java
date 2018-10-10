
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
public class Ora {
   
    public int kod;
    public String nev;
    public int kezdet;

    public Ora(int kod, String nev, int kezdet) {
        this.kod = kod;
        this.nev = nev;
        
        
        if (kezdet < 8)
             this.kezdet = 8;
        else if (kezdet > 19)
            this.kezdet = 19;
        else 
            this.kezdet = kezdet;
             
    }

    public int getKod() {
        return kod;
    }

    public String getNev() {
        return nev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", kezdet=" + kezdet + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ora other = (Ora) obj;
        if (this.kod != other.kod) {
            return false;
        }
        if (this.kezdet != other.kezdet) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }
      
    
}
    
    

