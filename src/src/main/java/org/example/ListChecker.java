package org.example;

import java.util.ArrayList;

public class ListChecker {
    ArrayList<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    @Override
    public String toString() {
        return "ListChecker{" +
                "animals=" + animals +
                '}';
    }
}
