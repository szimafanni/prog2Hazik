
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
    
    private static boolean checkForCity(Telepules[] h, Telepules base) {
        boolean hasCity = false;

        for (int i = 1; i < h.length; i++) {
            if (h[i].getTelepules_nev().equals(base.getTelepules_nev())) {
                hasCity = true;
                base.setHomerseklet(h[i].getHomerseklet());
                break;
            }
        }

        return hasCity;
    }

    private static void homerseklet(Telepules[] h, Telepules base) {

        if (!checkForCity(h, base)) {
            System.out.println("Missing data");
            System.exit(0);
        }

        rendez(h);

        for (int i = 0; i < h.length; i++) {
            if ((h[i].getHomerseklet()) > base.getHomerseklet()) {
                System.out.println(h[i].toString());

            }
        }
    }

    private static void rendez(Telepules[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getHomerseklet() < t[j].getHomerseklet()) {
                    Telepules tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                } else if (t[i].getHomerseklet() == t[j].getHomerseklet()) {
                    if (t[i].getTelepules_nev().compareTo(t[j].getTelepules_nev()) > 0) {
                        Telepules tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }

                }
            }
        }
    }

    public static void kiir(Telepules[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        String sor = sc.nextLine();
        String[] s = sor.split(" ");
        int n = Integer.parseInt(s[0]);

        Telepules[] telep = new Telepules[n];
        Telepules base = new Telepules(s[1], n);

        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(":");
            telep[i] = new Telepules(s[0], Integer.parseInt(s[1]));
        }

        System.out.println("\n");

        homerseklet(telep, base);

    }

}
