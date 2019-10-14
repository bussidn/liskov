package hierarchy.vivant.domaine.regne.embranchements.classe.ordre.espece;

import hierarchy.vivant.domaine.regne.embranchements.classe.ordre.Felin;

public class Chat extends Felin {
    public Chat(String nom, Fur fur) {
        super(nom, fur);
    }

    public String miaou() {
        return "meow";
    }
}
