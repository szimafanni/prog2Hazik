
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Teherautó extends Autó {
    
    public int maxSzállíthatóTeher;

    public Teherautó(int maxSzállíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return "Teherautó " + "maxSzállíthatóTeher=" + maxSzállíthatóTeher ;
    }
    

 

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
     return super.equals(obj) && (this.maxSzállíthatóTeher== ((Teherautó) obj).getMaxSzállíthatóTeher());
    }

    


}
