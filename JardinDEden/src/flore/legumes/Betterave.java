package flore.legumes;

import flore.Vegetal;

public class Betterave extends Vegetal {
    public Betterave() {
        super();
        //En Feuille
        setElementOfDessin('b',3);
        //En Fleur
        setElementOfDessin('B',4);
        this.setNom("Bettrave");
    }
}
