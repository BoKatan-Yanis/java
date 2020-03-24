package animals.reptile;

import animals.Vertebrate;

public abstract class Reptile extends Vertebrate {
    private int nbScales;

    public Reptile(String name) {
        super(name);
    }

    public abstract int getScales();

    public int getNbScales() {
        return nbScales;
    }

    public void setNbScales(int nbScales) {
        this.nbScales = nbScales;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "nbScales=" + getScales() +
                "} " + super.toString();
    }
}
