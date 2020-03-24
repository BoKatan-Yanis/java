package animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }


    public Animal(String name, String sound) {
        this.name = name;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", song='" + getSound() + '\'' +
                '}';
    }


}
