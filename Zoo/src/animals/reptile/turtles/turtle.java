package animals.reptile.turtles;

import animals.reptile.Reptile;

public class turtle extends Reptile {
    private int speed;

    public turtle(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "coin coin";
    }

    @Override
    public int getVertebras() {
        return 10;
    }

    @Override
    public int getScales() {
        return 4;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "turtle{" +
                "speed=" + getSpeed() +
                "} " + super.toString();
    }
}
