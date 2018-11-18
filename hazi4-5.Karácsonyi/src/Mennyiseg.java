
import java.util.List;
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
public class Mennyiseg {
    public int mennyiseg;
    private List<Karácsonyi> menny;

    public Mennyiseg(int mennyiseg, List<Karácsonyi> menny) {
        this.mennyiseg = mennyiseg;
        this.menny = menny;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public List<Karácsonyi> getMenny() {
        return menny;
    }

    public void setMenny(List<Karácsonyi> menny) {
        this.menny = menny;
    }

    @Override
    public String toString() {
        return "Mennyiseg{" + "mennyiseg=" + mennyiseg + ", menny=" + menny + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Mennyiseg other = (Mennyiseg) obj;
        if (this.mennyiseg != other.mennyiseg) {
            return false;
        }
        if (!Objects.equals(this.menny, other.menny)) {
            return false;
        }
        return true;
    }
    
    
    
}
