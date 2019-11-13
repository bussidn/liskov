package list.exercice;

import list.exercice.hierarchy.vivant.domaine.regne.Animal;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebre;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.Mammifere;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felin;
import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece.Chat;

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
        List<Chat> chats = new ArrayList<>(someList());
        List<Felin> felins = new ArrayList<>(someList());
        List<Mammifere> mammiferes = new ArrayList<>(someList());
        List<Vertebre> vertebres = new ArrayList<>(someList());
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

    private static void afficheLesNoms(List<Animal> animaux) {
        for (Animal animal : animaux)
            System.out.println(animal.getNom());
    }

    private static void afficheLesFourrures(List<Mammifere> mammiferes) {
        for (Mammifere mammifere : mammiferes)
            System.out.println(mammifere.fourrure());

    }
}
