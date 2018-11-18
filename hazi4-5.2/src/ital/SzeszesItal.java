
package ital;

/**
 *
 * @author Fanni
 */
public class SzeszesItal extends Ital {
    private int alkoholTartalom;


    public SzeszesItal(int alkoholTartalom, String név, String kiszerelés, int ár) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom + "% alkoholTartalomú " + super.toString();
    }
    
  
    
    
    
}
