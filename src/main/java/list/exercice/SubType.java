package list.exercice;

import list.exercice.hierarchy.vivant.domaine.regne.Animal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebre;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.Mammifere;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felin;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Chat;

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
        List<Chat> chats = new ArrayList<>(someList());
        List<Felin> felins = new ArrayList<>(someList());
        List<Mammifere> mammiferes = new ArrayList<>(someList());
        List<Vertebre> vertebres = new ArrayList<>(someList());
        List<Animal> animaux = new ArrayList<>(someList());

        // on veut que ça compile
        //donneChevalBonus(chats);
        //donneChevalBonus(felins);
        //donneChevalBonus(mammiferes);
        //donneChevalBonus(vertebres);
        //donneChevalBonus(animaux);

        // on ne veut PAS que ça compile ?

        chats.forEach(e -> System.out.println(e.miaou()));
        felins.forEach(Felin::flayTail);
        mammiferes.forEach(e -> System.out.println(e.fourrure()));
        vertebres.forEach(Vertebre::growBones);
        animaux.forEach(Animal::eat);

    }

    private static List<Chat> someList() {
        return Arrays.asList(
                new Chat("Felix", Mammifere.fourrure.BLACK_AND_WHITE),
                new Chat("Garfield", Mammifere.fourrure.ORANGE),
                new Chat("Madcat", Mammifere.fourrure.BLACK),
                new Chat("Grumpy Cat", Mammifere.fourrure.GREY)
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
