

/**
 *
 * @author Fanni
 */
public class Gyümölcs {
    public String fajta;
    public String íz;

    public Gyümölcs(String fajta, String íz) {
        this.fajta = fajta;
        this.íz = íz;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getÍz() {
        return íz;
    }

    public void setÍz(String íz) {
        this.íz = íz;
    }
    
    
    public String milyenFajtaju(){
        return null;
        
    }
    
    public String milyenIzu(){
        return null;
        
    }

    @Override
    public String toString() {
        return "Gy\u00fcm\u00f6lcs{" + "fajta=" + fajta + ", \u00edz=" + íz + '}';
    }
    
    
    
}
