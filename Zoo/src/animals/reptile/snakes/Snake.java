package animals.reptile.snakes;

import animals.reptile.Reptile;

public class Snake extends Reptile {
    private int nbDevouredMouse;

    public Snake(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "ssssssss";
    }

    @Override
    public int getVertebras() {
        return 100;
    }

    @Override
    public int getScales() {
        return 200;
    }


    public int getNbDevouredMouse() {
        return nbDevouredMouse;
    }

    public void setNbDevouredMouse(int nbDevouredMouse) {
        this.nbDevouredMouse = nbDevouredMouse;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "nbDevouredMouse=" + getNbDevouredMouse() +
                "} " + super.toString();
    }
}
