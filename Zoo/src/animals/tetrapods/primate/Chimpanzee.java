package animals.tetrapods.primate;

import animals.tetrapods.Mammal;

public class Chimpanzee extends Mammal {
    private int nbBanana;

    public Chimpanzee(String name) {
        super(name);

    }

    @Override
    public String getSound() {
        return "Houhouhou ahaha";
    }

    @Override
    public int getVertebras() {
        return 20;
    }

    @Override
    public int getUdders() {
        return 6;
    }

    public int getNbBanana() {
        return nbBanana;
    }

    public void setNbBanana(int nbBanana) {
        this.nbBanana = nbBanana;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "nbBanana=" + getNbBanana() +
                "} " + super.toString();
    }
}
