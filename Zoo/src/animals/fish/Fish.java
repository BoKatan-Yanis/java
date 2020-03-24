package animals.fish;

import animals.Vertebrate;

public abstract class Fish extends Vertebrate {
    private int nbFin;


    public Fish(String name) {
        super(name);
    }

    public abstract int getFin();

    public int getNbFin() {
        return nbFin;
    }

    public void setNbFin(int nbFin) {
        this.nbFin = nbFin;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nbFin=" + getFin() +
                "} " + super.toString();
    }
}
