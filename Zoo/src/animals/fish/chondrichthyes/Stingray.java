package animals.fish.chondrichthyes;

import animals.fish.Fish;

public class Stingray extends Fish {
    private int surface;


    public Stingray(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public int getVertebras() {
        return 12;
    }

    @Override
    public int getFin() {
        return 2;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Stingray{" +
                "surface=" + getSurface() +
                "} " + super.toString();
    }
}
