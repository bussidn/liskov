package list.exercice.hierarchy.vivant.domaine.regne.embranchements.classe;

import list.exercice.hierarchy.vivant.domaine.regne.embranchements.Vertebre;

public class Mammifere extends Vertebre {
    private fourrure fourrure;

    public Mammifere(String nom, fourrure fourrure) {
        super(nom);
        this.fourrure = fourrure;
    }

    public fourrure fourrure() {
        return fourrure;
    }

    public enum fourrure {
        BROWN, TRICOLORE, BLACK, ORANGE, BLACK_AND_WHITE, GREY
    }
}
