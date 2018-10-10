
import java.util.Random;
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
public class main {
    
    public static void main(String[] args) {
        System.out.println("Kő papír olló játék");
        System.out.println("Beírható szavak: ko, papir, ollo, vege");
        String szoveg="";
        while(szoveg!="vege")
        {
            Scanner sc = new Scanner(System.in);
            szoveg = sc.nextLine();
            if((szoveg.equals("ko"))||(szoveg.equals("papir"))||(szoveg.equals("ollo"))||(szoveg.equals("vege"))){
                int jatekos_ertek=3;
                if (szoveg.equals("vege")) {
                    System.out.println("Vége a játéknak");
                    break;
                }                
                if (szoveg.equals("ko")){
                    jatekos_ertek=0;
                }
                if (szoveg.equals("papir")){
                    jatekos_ertek=1;
                }
                if (szoveg.equals("ollo")){
                    jatekos_ertek=2;
                }
                Random rn = new Random();
                int szam = rn.nextInt(3);    
                if (szam==0){
                    System.out.println("Gép: ko");
                }
                if (szam==1){
                    System.out.println("Gép: papir");
                }
                if (szam==2){
                    System.out.println("Gép: ollo");
                }
                
                if(szam==jatekos_ertek){
                    System.out.println("Döntetlen");
                }
                else if(    ((jatekos_ertek==0)&&(szam==1))  ||  ((jatekos_ertek==1)&&(szam==2))  ||   ((jatekos_ertek==2)&&(szam==0))  ){
                    System.out.println("Gép nyert");
                }
                else System.out.println("Játékos nyert");
            

            }
           
            else System.out.println("Hibás a beírt input");
        }
    }
    
}

   