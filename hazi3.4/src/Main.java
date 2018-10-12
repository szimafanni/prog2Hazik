
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanni
 */
public class Main {
     private static Hullámvasút hullam[];
    
    private static void rendez(Hullámvasút[] t)
    {
         for(int i=0;i<t.length-1;i++){
            for(int j=i+1;j<t.length;j++)
                if (t[i].getVárakozási_idő()>t[j].getVárakozási_idő()){
                    Hullámvasút tmp= t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                    
                }
         else if(t[i].getVárakozási_idő()==t[j].getVárakozási_idő())
             if(t[i].getLegkisebb_magasság()<t[j].getLegkisebb_magasság()){
                   Hullámvasút tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
             }
            
         else if(t[i].getHullámvasút_neve().compareTo(t[j].getHullámvasút_neve())>0){
                            Hullámvasút tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp; 
                        }
         }     
    }      
            
    
       public static void kiir(Hullámvasút[] k){
            for (int i=0; i<k.length;i++)
                System.out.println(k[i]);
        }
    
    
    
    public static void main(String[] args) { 
        int n;
        Scanner sc= new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        hullam= new Hullámvasút[n];

        
        for(int i=0;i<n;i++){
             String sor= sc.nextLine();
             String st[]=sor.split(";");
             hullam[i]= new Hullámvasút(st[0], st[1],Integer.parseInt(st[2]), Integer.parseInt(st[3]));
        }
            System.out.println("\n");
            
            rendez(hullam);
            kiir(hullam);
        

    }
}
