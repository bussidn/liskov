package list.exercice;

import list.exercice.hierarchy.vivant.domaine.regne.Animal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebrate;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.Mammal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felidae;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Cat;

import java.util.ArrayList;
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
        List<Cat> cats = new ArrayList<>(someList());
        List<Felidae> felidaes = new ArrayList<>(someList());
        List<Mammal> mammals = new ArrayList<>(someList());
        List<Vertebrate> vertebrates = new ArrayList<>(someList());
        List<Animal> animaux = new ArrayList<>(someList());

        // on veut que ca compile
        //afficheLesNoms(chats);
        //afficheLesFourrures(chats);
        //afficheLesNoms(felins);
        //afficheLesFourrures(felins);
        //afficheLesNoms(mammiferes);
        //afficheLesFourrures(mammiferes);
        //afficheLesNoms(vertebres);
        //afficheLesFourrures(vertebres);
        //afficheLesNoms(animaux);
        //afficheLesFourrures(animaux);

        // on ne veut PAS que ca compile ?

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

    private static void afficheLesNoms(List<Animal> animaux) {
        for (Animal animal : animaux)
            System.out.println(animal.getNom());
    }

    private static void afficheLesFourrures(List<Mammal> mammals) {
        for (Mammal mammal : mammals)
            System.out.println(mammal.fourrure());

    }
}
