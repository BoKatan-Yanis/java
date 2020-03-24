package prod;

import flore.Vegetal;

public class Emplacement {
    private Vegetal vegetal;
    private Coordonee coordonee;

    Emplacement(Vegetal vegetal, Coordonee coordonee)
    {
        setVegetal(vegetal);
        setCoordonee(coordonee);
    }

    public Vegetal getVegetal() {
        return vegetal;
    }

    public void setVegetal(Vegetal vegetal) {
        this.vegetal = vegetal;
    }

    public Coordonee getCoordonee() {
        return coordonee;
    }

    public void setCoordonee(Coordonee coordonee) {
        this.coordonee = coordonee;
    }
}
