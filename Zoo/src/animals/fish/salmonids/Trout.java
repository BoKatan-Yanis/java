package animals.fish.salmonids;

import animals.fish.Fish;

public class Trout extends Fish {
    private int nbHooksAvoided;


    public Trout(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public int getVertebras() {
        return 0;
    }

    @Override
    public int getFin() {
        return 0;
    }

    public int getNbHooksAvoided() {
        return nbHooksAvoided;
    }

    public void setNbHooksAvoided(int nbHooksAvoided) {
        this.nbHooksAvoided = nbHooksAvoided;
    }

    @Override
    public String toString() {
        return "Trout{" +
                "nbHooksAvoided=" + getNbHooksAvoided() +
                "} " + super.toString();
    }
}
