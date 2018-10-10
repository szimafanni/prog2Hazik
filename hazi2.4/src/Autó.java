
import java.util.Date;
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
public class Autó {
    public String rendszám;
    public int motorTeljesítmény;
    public Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma=new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }


    @Override
    public String toString() {
        return "Autó{" + "rendszám=" + rendszám + ", motorTeljesítmény=" + motorTeljesítmény + ", gyártásDátuma=" + gyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Autó))
            
            return false;
        
        Autó auto= (Autó) obj;
        return this.rendszám.equals(auto.rendszám) && this.gyártásDátuma==auto.getGyártásDátuma();
                

    
}
}