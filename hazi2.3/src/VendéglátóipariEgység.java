
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
public class VendéglátóipariEgység {  
    public String név;
    public int férőhelyekSzáma;
    public boolean dohányzó;

    public VendéglátóipariEgység(String név, int férőhelyekSzáma, boolean dohányzó) {
        this.név = név;
        this.férőhelyekSzáma = férőhelyekSzáma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return név;
    }

    public int getFérőhelyekSzáma() {
        return férőhelyekSzáma;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }
    
    
    public boolean isDohányzó(){
             return false;
    }

    @Override
    public String toString() {
        return "VendéglátóipariEgység{" + "név=" + név + ", férőhelyekSzáma=" + férőhelyekSzáma + ", dohányzó=" + dohányzó+" ";
    }
  
    
}
