package prod;

import animals.Animal;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    @Override
    public String toString() {

        return "Zoo{" +
                "animals=" +  +
                '}';
    }
}
