/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Fanni
 */
public class Dolgozat implements Pontozhato<Dolgozat> {
        public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }
        

    @Override
    public boolean megfelelt(Dolgozat o) {
         if( o.pontszam>35)
                 return true;
         else return false;
    }
        

    }
    

