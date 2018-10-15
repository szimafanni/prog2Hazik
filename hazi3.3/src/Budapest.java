
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fanni
 */
public class Budapest {

    private int év;
    private int hónap;
    private int nap;
    private String túra_név;
    private int résztáv;
    private Date datum;

    public Budapest(int év, int hónap, int nap, String túra_név, int résztáv) {
        this.év = év;
        this.hónap = hónap;
        this.datum = new Date(this.év, this.hónap, this.nap);
        this.nap = nap;
        this.túra_név = túra_név;
        this.résztáv = résztáv;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public void setHónap(int hónap) {
        this.hónap = hónap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public void setTúra_név(String túra_név) {
        this.túra_név = túra_név;
    }

    public void setRésztáv(int résztáv) {
        this.résztáv = résztáv;
    }

    public int getÉv() {
        return év;
    }

    public int getHónap() {
        return hónap;
    }

    public int getNap() {
        return nap;
    }

    public String getTúra_név() {
        return túra_név;
    }

    public int getRésztáv() {
        return résztáv;
    }

    @Override
    public String toString() {
        return "Budapest{" + "\u00e9v=" + év + ", h\u00f3nap=" + hónap + ", nap=" + nap + ", t\u00fara_n\u00e9v=" + túra_név + ", r\u00e9szt\u00e1v=" + résztáv + '}';
    }

}
