package animals.tetrapods.carnivore;

import animals.tetrapods.Mammal;

public class Bear extends Mammal {
    private int literHoney;

    public Bear(String name) {
        super(name);
    }

    @Override
    public int getVertebras() {
        return 50;
    }

    @Override
    public int getUdders() {
        return 0;
    }

    @Override
    public String getSound() {
        return "Grrrrrrr";
    }

    public int getLiterHoney() {
        return literHoney;
    }

    public void setLiterHoney(int literHoney) {
        this.literHoney = literHoney;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "literHoney=" + getLiterHoney() +
                "} " + super.toString();
    }
}
