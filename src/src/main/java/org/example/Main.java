package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("WTF");
        Animal animal1 = new Animal(1,"Dog");
        Animal animal2 = new Animal(2,"Elephant");
        Animal animal3 = new Animal(3,"Wolf");
        Animal animal4 = new Animal(4,"Fox");
        Animal animal5 = new Animal(5,"Cat");
        ListChecker listChecker = new ListChecker();
        listChecker.addAnimal(animal1);
        listChecker.addAnimal(animal2);
        listChecker.addAnimal(animal3);
        listChecker.addAnimal(animal4);
        listChecker.addAnimal(animal5);
        listChecker.removeAnimal(animal1);
        listChecker.removeAnimal(animal2);
        System.out.println(listChecker);
    }
}