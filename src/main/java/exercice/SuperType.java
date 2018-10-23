package exercice;

import hierarchy.vivant.domaine.regne.Animal;
import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Chat;

import java.util.Arrays;
import java.util.List;

public class SuperType {

     /*
        Dans un jeu où on collectionne différents animaux, on veut afficher la liste des animaux collectionnés.

        L'utilisateur est en mesure d'utiliser des filtres pour voir une portion plus spécifique de sa collection

        Quels types voudrait-on que la méthode afficheLesNoms soit capable d'accepter ?
            - List<Object> ?
            - List<Animaux> ?
            - List<Mammifere> ?
            - List<Chat> ?
            - List<Cheval> ?

         Si on considère que la ligne 34 doit compiler, quelles modifications apporter à la signature de la
         méthode afficheLesNoms pour y parvenir ?
     */

    public static void main(String[] args) {
        List<Chat> collectionFiltree = Arrays.asList(
                new Chat("Felix"),
                new Chat("Garfield"),
                new Chat("Madcat"),
                new Chat("Grumpy Cat")
        );

        // afficheLesNoms(collectionFiltree);
    }

    public static void afficheLesNoms(List<Animal> animaux) {
        for (Animal animal : animaux)
            System.out.println(animal.getNom());
    }
}
