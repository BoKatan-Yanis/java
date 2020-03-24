package animals.tetrapods;

import animals.Vertebrate;

public abstract class Mammal extends Vertebrate {
    private int nbUdders;
    public Mammal(String name) {
        super(name);
    }

    public abstract int getUdders();

    public int getNbUdders() {
        return nbUdders;
    }

    public void setNbUdders(int nbUdders) {
        this.nbUdders = nbUdders;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "nbUdders=" + getUdders() +
                "} " + super.toString();
    }
}

