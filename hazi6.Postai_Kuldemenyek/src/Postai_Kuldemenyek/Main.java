/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Postai_Kuldemenyek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fanni
 */
public class Main {
    public static void main(String[] args) {
        
        List<Iranyitoszam> iranyitoszamokListaja = new ArrayList<Iranyitoszam>();
        
        try{
            FileReader fr = new FileReader(new File("samplePostai.txt"));   
            BufferedReader buffer = new BufferedReader(fr);
            
            String sor;
            
            while ((sor = buffer.readLine()) != null) {
                
                String[] adatok = sor.split(":");
                
                Iranyitoszam i = new Iranyitoszam(Integer.parseInt(adatok[1]));
                Cimzett c = new Cimzett(adatok[0], Integer.parseInt(adatok[1]), adatok[2], adatok[3], Integer.parseInt(adatok[4]), Integer.parseInt(adatok[5]));
                
                if (iranyitoszamokListaja.contains(i)){                        
                    if (iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getCimzett().contains(c)){                    
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).setOsszErtek(iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getOsszErtek() + c.getCsomagErteke());       
                    } else {                                                   
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).setOsszErtek(iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getOsszErtek() + c.getCsomagErteke());        
                        iranyitoszamokListaja.get(iranyitoszamokListaja.indexOf(i)).getCimzett().add(c);       
                    }
                } else {                                                       
                    i.getCimzett().add(c);                                      
                    i.setOsszErtek(i.getOsszErtek() + c.getCsomagErteke());    
                    iranyitoszamokListaja.add(i);                               
                }
                
            }
            
            buffer.close();
            
        } catch (IOException i) {
            System.out.println("Hibás fájl beolvasáshoz");
        }
        
        Collections.sort(iranyitoszamokListaja);
        
        for (Iranyitoszam i : iranyitoszamokListaja){
            System.out.println(i);
        }
        
    }
}