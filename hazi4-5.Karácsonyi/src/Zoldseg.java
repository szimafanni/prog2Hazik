
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
public class Zoldseg implements Comparable<Zoldseg>{
    public String zoldseg;
    private List<Karácsonyi> zold;

    public Zoldseg(String zoldseg, List<Karácsonyi> zold) {
        this.zoldseg = zoldseg;
        this.zold = zold;
    }

    public String getZoldseg() {
        return zoldseg;
    }

    public void setZoldseg(String zoldseg) {
        this.zoldseg = zoldseg;
    }

    public List<Karácsonyi> getZold() {
        return zold;
    }

    public void setZold(List<Karácsonyi> zold) {
        this.zold = zold;
    }

    @Override
    public String toString() {
        return "Zoldseg{" + "zoldseg=" + zoldseg + ", zold=" + zold + '}';
    }

    @Override
    public int compareTo(Zoldseg o) {
         if (this.zoldseg == o.getZoldseg()) {
            return this.zoldseg.compareTo(o.getZoldseg());
         }
            else
        {

}
        return 0;
    }

}