package animals.pets;

import animals.Animal;

public class Dog extends Animal {

    public Dog(String name, int age, int weight, String color) {
        Animal.setName(name);
        Animal.setAge(age);
        Animal.setWeight(weight);
        Animal.setColor(color);
    }

    @Override
    public void say() {
        System.out.println("Я говорю Гав");
    }
}