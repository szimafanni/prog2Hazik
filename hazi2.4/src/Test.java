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

   private static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
   int count=0;
   for(int i=0;i<teher.length;i++){
       if(teher[i] instanceof Teherautó){
               Teherautó t=(Teherautó)teher[i];
               for(int j=0;j<t.getMaxSzállíthatóTeher();j++){
                  if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                  Teherautó tmp=teher[i];
                  teher[i]=teher[j];
                  teher[j]=tmp;
                   }
               }
   }
   }
   Teherautó[] tehera=new Teherautó[count];

        int k=0;
         for(int i=0;i<teher.length;i++){
           if(teher[i] instanceof Teherautó)
           {
               Teherautó t=(Teherautó)teher[i];
               for(int j=0;j<t.getMaxSzállíthatóTeher();j++){
                  if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                      tehera[k]=t;
                      k++;
                   }
               }
           }
       }
        }
       
   
   
   private static Autó keresMaxMotorTeljesítmény(Autó[] auto){
         int count=0;
   for(int i=0;i<auto.length;i++){
       if(auto[i] instanceof Autó){
               Autó a=(Autó)auto[i];
               for(int j=0;j<a.getMotorTeljesítmény();j++){
                  if(auto[i].motorTeljesítmény < auto[j].motorTeljesítmény) {
                       Autó tmp=auto[i];  
                       auto[i]=auto[j];
                       auto[j]=tmp;
               }         
               }
   }
   }
 Autó[] autoka=new Autó[count];

        int k=0;
         for(int i=0;i<auto.length;i++){
           if(auto[i] instanceof Autó)
           {
                Autó a=(Autó)auto[i];
               for(int j=0;j<a.getMotorTeljesítmény();j++){
                  if(auto[i].motorTeljesítmény < auto[j].motorTeljesítmény) {
                      autoka[k]=a;
                      k++;
                   }
               }
           }
         }
    return null;
}
           
           
   
    public static void main(String[] args) {
       Autó [] auto= new Autó[]{
            new Autó("ABC123",100),
            new Autó("ANM345",200),
            new Autó("ASD236",170),
            new Autó("AHF352",150),
            new Autó("ALB545",200),
            new Teherautó(2000,"THG123",300),
            new Teherautó(3000,"TGF225",400),
            new Teherautó(4000,"TEW456" ,500),
            new Teherautó(5000,"TAS410",600),
            new Teherautó(4000,"TBV841" ,300)     
       };
    
    Teherautó[] teher=new Teherautó[]{
        new Teherautó(1000,"TEH123", 200),
        new Teherautó(2000,"TSH223",300),
        new Teherautó(3000,"TBF114", 400),
        new Teherautó(3000,"TFD456", 500),
        new Teherautó(4000,"TVX789", 600),
        new Teherautó(2500,"TBN026", 500),
        new Teherautó(3500,"TSD123", 400),
        new Teherautó(5000,"TPG852", 600),
        new Teherautó(6000,"THS456", 500),
        new Teherautó(7000,"TNB111", 300)       
    };
 
   
    

     Autó[] aut=keresMaxMotorTeljesítmény(auto);
        for(Autó a:aut)
                System.out.println(a);
    
    
    
   Teherautó[] teh=rendezMaxSzállíthatóTeherCsökkenőleg(teher);
   for(Teherautó t:teh)
            System.out.println(t);

    
    
   
    }
}
