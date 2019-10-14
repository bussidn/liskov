package exercice;

import hierarchy.vivant.domaine.regne.Animal;
import hierarchy.vivant.domaine.regne.embranchements.Vertebre;
import hierarchy.vivant.domaine.regne.embranchements.classe.Mammifere;
import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felin;
import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Chat;
import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Cheval;

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
        List<Chat> collection1 = new ArrayList<>(Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        ));

        //donneChevalBonus(collection1);

        collection1.forEach(e -> System.out.println(e.miaou()));


        List<Felin> collection2 = new ArrayList<>(Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        ));

        //donneChevalBonus(collection2);

        collection2.forEach(Felin::flayTail);


        List<Mammifere> collection3 = new ArrayList<>(Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        ));

        //donneChevalBonus(collection3);

        collection3.forEach(e -> System.out.println(e.fur()));


        List<Vertebre> collection4 = new ArrayList<>(Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        ));

        //donneChevalBonus(collection4);

        collection4.forEach(Vertebre::growBones);


        List<Animal> collection5 = new ArrayList<>(Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        ));

        //donneChevalBonus(collection5);

        collection5.forEach(Animal::eat);

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
