package Animals.pets;

import Animals.Animal;

public class Cat extends Animal {

    public Cat(String name, int age, int weight, String color) {
        Animal.setName(name);
        Animal.setAge(age);
        Animal.setWeight(weight);
        Animal.setColor(color);
    }


    @Override
    public void say() {
        System.out.println("Я говорю Мяу");
    }
}