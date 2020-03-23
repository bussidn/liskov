package list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe;

import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebrate;

public class Mammal extends Vertebrate {
    private Fur Fur;

    public Mammal(String nom, Fur Fur) {
        super(nom);
        this.Fur = Fur;
    }

    public Fur fourrure() {
        return Fur;
    }

    public enum Fur {
        BROWN, TRICOLORE, BLACK, ORANGE, BLACK_AND_WHITE, GREY
    }
}
