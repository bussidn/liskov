package exercice;

import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Chat;
import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Cheval;

import java.util.Arrays;
import java.util.List;

public class Subtype {

    /*
        Dans un jeu où on collectionne différents animaux, il arrive qu'on offre un animal bonus généré chaque semaine.

        Dans notre exemple, le jeu démarre avec un offre premium DLC qui offre 4 chats et l'animal bonus de la semaine.

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
        List<Chat> collection = Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        );

        giveBonusAnimal(collection);

    }

    private static void giveBonusAnimal(List<?> collection) {
        // add bonus animal to collection
        //collection.add(bonusAnimal());
    }

    public static Object bonusAnimal() {
        return new Cheval("Vincent");
    }
}
