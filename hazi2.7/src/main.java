/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Fanni
 */
public class main {

    public static void main(String[] args) {
  
       Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a napot:\n");
        String nap = sc.nextLine();
        System.out.println("Hány órát szeretnénk hozzáadni?\n");
        int hanyorat = Integer.parseInt(sc.nextLine());
        
        for (int i = 0;i<hanyorat;i++){
            System.out.println("Kérem az "+(i+1)+". óra kódját:\n");
            int kod = Integer.parseInt(sc.nextLine());
            System.out.println("Kérem az "+(i+1)+". óra nevét:\n");
            String nev = sc.nextLine();
            System.out.println("Kérem az "+(i+1)+". óra kezdő időpontját:\n");
            int kezdet = Integer.parseInt(sc.nextLine());
            
            orak[i] = new Ora(kod,nev,kezdet);
        }
        
        Orarend orarend = new Orarend(nap);        
        System.out.println("Az Órarend adatai;");
        System.out.println(orarend.toString());
               
    }
}
