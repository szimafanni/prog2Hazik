
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

    private static void ellenorzopont(Budapest[] leghosszabbutvonal) {
        int x = 0;
        for (int i = 0; i < leghosszabbutvonal.length - 1; i++) {
            for (int j = i + 1; j < leghosszabbutvonal.length; j++) {
                x = leghosszabbutvonal[i].getRésztáv() + leghosszabbutvonal[j].getRésztáv();
            }
        }

    }

    private static void rendez(Budapest[] rendez) {
        for (int i = 0; i < rendez.length - 1; i++) {
            for (int j = i + 1; j < rendez.length; j++) {
                if (rendez[i].getRésztáv() < rendez[j].getRésztáv()) {
                    Budapest tmp = rendez[i];
                    rendez[i] = rendez[j];
                    rendez[j] = tmp;
                } else if (rendez[i].getNap() < rendez[j].getNap()) {
                    Budapest tmp = rendez[i];
                    rendez[i] = rendez[j];
                    rendez[j] = tmp;

                } else if (rendez[i].getNap() == rendez[j].getNap()) {
                    if (rendez[i].getTúra_név().compareTo(rendez[j].getTúra_név()) > 0) {
                        Budapest tmp = rendez[i];
                        rendez[i] = rendez[j];
                        rendez[j] = tmp;
                    }
                }
            }

        }
    }

    public static void kiir(Budapest[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] s = sor.split("");
        int n = Integer.parseInt(s[0]);
        Budapest[] buda = new Budapest[n];

        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            s = sor.split(";");
            buda[i] = new Budapest((s[0]), (s[1]), (s[2]), Integer.parseInt(s[4]), s[5]);
        }

        System.out.println("\n");

        ellenorzopont(buda);
        rendez(buda);

    }

}
