/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Bor extends AlkoholosItal {

    public String szoloFajta;
    public String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, double alhoholTartalom) {
        super(iz, alhoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String milyenSzolobolKeszult() {
        return null;

    }

    public String mibolKeszult() {
        return null;

    }

    public String holTermelt() {
        return null;

    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }

    @Override
    public double mennyiAlkoholtTartalamz(AlkoholosItal o) {
        return alhoholTartalom;
        

    }

}
