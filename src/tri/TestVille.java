package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("ville2", 90));
        villes.add(new Ville("ville3", 6000));
        villes.add(new Ville("ville1", 300));
        villes.add(new Ville("ville4", 2500));

        // on tri par nb habitants
        //villes.sort(new ComparatorHabitant());

        // on tri par nom de la ville
        villes.sort(new ComparatorNom());

        for (Ville ville : villes) {
            System.out.println(ville);
        }

    }

}
