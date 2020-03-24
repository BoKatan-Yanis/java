package flore.legumes;

import flore.Vegetal;

public class Ail extends Vegetal {
    private String name;

    public Ail() {
        super();
        //En Feuille
        setElementOfDessin('a',3);
      //En Fleur
        setElementOfDessin('A',4);

        this.setNom("Ail");
    }
}
