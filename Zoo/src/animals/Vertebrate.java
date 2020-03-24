package animals;

public abstract class Vertebrate extends Animal {
 private int nbVertebras;

    public Vertebrate(String name) {
        super(name);
    }

    public abstract int getVertebras();

    public int getNbVertebras() {
        return nbVertebras;
    }

    public void setNbVertebras(int nbVertebras) {
        this.nbVertebras = nbVertebras;
    }

    @Override
    public String toString() {
        return "Vertebrate{" +
                "nbVertebras=" + getVertebras() +
                "} " + super.toString();
    }
}
