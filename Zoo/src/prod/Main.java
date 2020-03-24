package prod;

import animals.Animal;
import animals.fish.chondrichthyes.Shark;
import animals.tetrapods.primate.Chimpanzee;

public class Main {
    public static void main(String[] args) {
        Animal shark1 = new Shark("Jaws");
        Animal chinpanze1 =  new Chimpanzee("Cheeta");
        Animal shark2 = new Shark("Jaws");
    System.out.println(shark1.toString() + " \n "+ chinpanze1.toString() + " \n " + shark2.toString() + " \n ");

    }
}
