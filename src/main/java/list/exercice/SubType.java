package list.exercice;

import list.exercice.hierarchy.vivant.domaine.regne.Animal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebrate;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.Mammal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felidae;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubType {

    /*
        Dans un jeu où on collectionne différents animaux, il arrive qu'on offre un animal bonus généré chaque semaine.

        Dans notre exemple, le jeu démarre avec une offre premium DLC qui offre 4 chats et l'animal bonus de la semaine.

        Quel type devrait retourner la méthode bonusAnmial ?

        Quels types de listes devrait accepter la méthode giveBonusAnimal ?
            - List<Object> ?
            - List<Animal> ?
            - List<Mammifere> ?
            - List<Chat> ?
            - List<Cheval> ?

        Confrontez vos réponses lorsque l'animal de la semaine est un pigeon.
     */

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(someList());
        List<Felidae> felidaes = new ArrayList<>(someList());
        List<Mammal> mammals = new ArrayList<>(someList());
        List<Vertebrate> vertebrates = new ArrayList<>(someList());
        List<Animal> animaux = new ArrayList<>(someList());

        // on veut que ça compile
        //donneChevalBonus(chats);
        //donneChevalBonus(felins);
        //donneChevalBonus(mammiferes);
        //donneChevalBonus(vertebres);
        //donneChevalBonus(animaux);

        // on ne veut PAS que ça compile ?

        cats.forEach(e -> System.out.println(e.miaou()));
        felidaes.forEach(Felidae::flayTail);
        mammals.forEach(e -> System.out.println(e.fourrure()));
        vertebrates.forEach(Vertebrate::growBones);
        animaux.forEach(Animal::eat);

    }

    private static List<Cat> someList() {
        return Arrays.asList(
                new Cat("Felix", Mammal.Fur.BLACK_AND_WHITE),
                new Cat("Garfield", Mammal.Fur.ORANGE),
                new Cat("Madcat", Mammal.Fur.BLACK),
                new Cat("Grumpy Cat", Mammal.Fur.GREY)
        );
    }

    private static void donneChevalBonus(List<Animal> collection) {
        // add bonus animal to collection
        collection.add(chevalBonus());
    }

    private static Animal chevalBonus() {
        return randomFrom();
    }

    private static Animal randomFrom(Animal... animals) {
        return null;
    }
}
