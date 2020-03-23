package list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece;

import list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felidae;

public class Cat extends Felidae {
    public Cat(String nom, Fur Fur) {
        super(nom, Fur);
    }

    public String miaou() {
        return "meow";
    }
}
