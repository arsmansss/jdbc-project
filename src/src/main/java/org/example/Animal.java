package org.example;

public class Animal {
    int Age;
    String Name;

    public Animal(int age, String name) {
        Age = age;
        Name = name;
    }
    public Animal(){}

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
