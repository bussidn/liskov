package hierarchy.vivant.domaine.regne.embranchements.classe;

import hierarchy.vivant.domaine.regne.embranchements.Vertebre;

public class Mammifere extends Vertebre {
    private Fur fur;

    public Mammifere(String nom, Fur fur) {
        super(nom);
        this.fur = fur;
    }

    public Fur fur() {
        return fur;
    }

    public enum Fur {
        BROWN, TRICOLORE, BLACK, ORANGE, BLACK_AND_WHITE, GREY
    }
}
