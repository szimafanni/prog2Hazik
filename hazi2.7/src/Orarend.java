/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */




public class Orarend {
    
    public String nap; 
    public Ora[] Orak;
    public int Szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.Szamlalo = 0;
        this.Orak = new Ora[12];
       
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getOrak() {
        return Orak;
    }

    public int getSzamlalo() {
        return Szamlalo;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setOrak(Ora[] Orak) {
        this.Orak = Orak;
    }

    public void setSzamlalo(int Szamlalo) {
        this.Szamlalo = Szamlalo;
    }

    @Override
    public String toString() {
        
        return  "Orarend{" + "nap=" + nap + ", + Szamlalo= "+ Szamlalo;
   
    }
    
    public boolean oratHozzaad(Ora ora) {
        
     
        if  (this.Szamlalo>=12)
                return false;   
        for (int i = 0;i<this.Szamlalo;i++){       
           if (Orak[i].getKezdet() == ora.getKezdet()){
               return false;
           }            
         }   
        return true;

    }

}

    

