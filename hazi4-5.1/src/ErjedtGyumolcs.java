
/**
 *
 * @author Fanni
 */
public class ErjedtGyumolcs extends Gyümölcs implements Alkoholos<ErjedtGyumolcs>{
    public double alkaholTartalom;
    
    
    public ErjedtGyumolcs(String fajta, String íz) {
        super(fajta, íz);
    }

    public ErjedtGyumolcs(double alkaholTartalom, String fajta, String íz) {
        super(fajta, íz);
        this.alkaholTartalom = alkaholTartalom;
    }

    public double getAlkaholTartalom() {
        return alkaholTartalom;
    }

    public void setAlkaholTartalom(double alkaholTartalom) {
        this.alkaholTartalom = alkaholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkaholTartalom=" + alkaholTartalom + '}';
    }


    public double mennyiAlkoholtTartalmaz(){
        return alkaholTartalom;
        
    }

    @Override
    public double mennyiAlkoholtTartalamz(ErjedtGyumolcs o) {
    return alkaholTartalom;
        

    }
    
    
    
}
