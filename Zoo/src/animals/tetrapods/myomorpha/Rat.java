package animals.tetrapods.myomorpha;

import animals.tetrapods.Mammal;

public class Rat extends Mammal {
private int nbBinsVisited;

    public Rat(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Coin coin";
    }

    @Override
    public int getVertebras() {
        return 10;
    }

    @Override
    public int getUdders() {
        return 6;
    }


    public int getNbBinsVisited() {
        return nbBinsVisited;
    }

    public void setNbBinsVisited(int nbBinsVisited) {
        this.nbBinsVisited = nbBinsVisited;
    }

    @Override
    public String toString() {
        return "Rat{" +
                "nbBinsVisited=" + nbBinsVisited +
                "} " + super.toString();
    }
}
