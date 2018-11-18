
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos<AlkoholosItal> {

    public String iz;
    public double alhoholTartalom;

    public AlkoholosItal(String iz, double alhoholTartalom) {
        this.iz = iz;
        this.alhoholTartalom = alhoholTartalom;
    }

    public double mennyiAlkoholtTartalmaz() {
        return alhoholTartalom;

    }

    @Override
    public String milyenIzu() {
        return null;

    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alhoholTartalom=" + alhoholTartalom + '}';
    }

}
