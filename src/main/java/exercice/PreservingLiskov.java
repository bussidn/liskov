package exercice;

import list.exercice.hierarchy.vivant.domaine.regne.Animal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebrate;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.Mammal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felidae;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreservingLiskov {

    private static final List<Cat> cats = new ArrayList<>(someList());
    private static final List<Felidae> felidaes = new ArrayList<>(someList());
    private static final List<Mammal> mammals = new ArrayList<>(someList());
    private static final List<Vertebrate> vertebrates = new ArrayList<>(someList());
    private static final List<Animal> animals = new ArrayList<>(someList());

    private static List<Cat> someList() {
        return Arrays.asList(
                new Cat("Felix", Mammal.Fur.BLACK_AND_WHITE),
                new Cat("Garfield", Mammal.Fur.ORANGE),
                new Cat("Madcat", Mammal.Fur.BLACK),
                new Cat("Grumpy Cat", Mammal.Fur.GREY)
        );
    }
}
