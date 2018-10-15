/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Telepules {
   private String telepules_nev;
    private int homerseklet;

    public Telepules(String telepules_nev, int homerseklet) {
        this.telepules_nev = telepules_nev;
        this.homerseklet = homerseklet;
    }

    public String getTelepules_nev() {
        return telepules_nev;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }    
    
    @Override
    public String toString() {
        return telepules_nev + " (" + getHomerseklet()+")";
    }
    
    
    
    
    
    
}
