
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    public static List<Hátizsák> kiirMarkaSzerintABCazonbelulZsebekSzámaCsökk(List<Hátizsák> hzs) {
        for (int i = 0; i < hzs.size(); i++) {
            for (int j = 0; j < hzs.size(); j++) {

            }

        }
    }

    public static void main(String[] args) {
        List<Hátizsák> hzs = new ArrayList();
        hzs.add(new Hátizsák("puma", 12, 5, true));
        hzs.add(new Hátizsák("nike", 15, 4, true));
        hzs.add(new Hátizsák("adidas", 14, 6, false));
        hzs.add(new Hátizsák("nike2", 17, 7, false));
        hzs.add(new Hátizsák("puma2", 22, 5, true));

        for (int i = 0; i < hzs.size(); i++) {
            System.out.println(hzs.get(i));
        }

    }

}
