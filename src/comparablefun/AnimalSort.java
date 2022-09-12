package comparablefun;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalSort  {

    void printAnimalsInOrder (ArrayList<Animal> animals){
        System.out.println("before: " + animals);
        Collections.sort(animals); //tager arrayliste. En anden metode tager array
        System.out.println("after: " + animals);

    }

    public void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cheetah", 90, 130, 230));
        animals.add(new Animal("Cow", 4, 30, 600));
        animals.add(new Animal("Crocodile", 100, 60, 300));
        animals.add(new Animal("Turtle", 1, 2, 20));

        printAnimalsInOrder(animals);
    }

    public static void main(String[] args) {
        new AnimalSort().go();
    }
}
