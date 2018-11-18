
import java.util.ArrayList;
import java.util.List;
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
public class Test {

    private static Karácsonyi kar[];
    
           public static void kiir(Karácsonyi[] k){
            for (int i=0; i<k.length;i++)
                System.out.println(k[i]);
        }
    
    

    public static void main(String[] args) {
        
         List<Karácsonyi> karacsony = new ArrayList();

         Scanner sc= new Scanner(System.in);
         String sor=sc.nextLine();
          while (sor.length() > 0) {
                String[] darabolt = sor.split(";");
                
            for (int i = 0; i < darabolt.length; i++) {
                Karácsonyi k = new Karácsonyi(darabolt[i],i);
              
              
              
          }
          
          
          
//            n=Integer.parseInt(sc.nextLine());
//                kar= new Karácsonyi[n];
//
//         for(int i=0;i<n;i++){
//             String sor= sc.nextLine();
//             String st[]=sor.split(";");
//             kar[i]= new Karácsonyi(st[0], Integer.parseInt(st[1]));
//    
//             
//             
//             kiir(kar);
    }
}
}