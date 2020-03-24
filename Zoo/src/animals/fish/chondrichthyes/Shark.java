package animals.fish.chondrichthyes;

import animals.fish.Fish;

public class Shark extends Fish {
    private int nbDevouredHuman;

    public Shark(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public int getVertebras() {
        return 100;
    }

    @Override
    public int getFin() {
        return 6;
    }


    public int getNbDevouredHuman() {
        return nbDevouredHuman;
    }

    public void setNbDevouredHuman(int nbDevouredHuman) {
        this.nbDevouredHuman = nbDevouredHuman;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "nbDevouredHuman=" + getNbDevouredHuman() +
                "} " + super.toString();
    }
}
