package Animals.fly;

import Animals.Animal;

public class Duck extends Animal implements Flying {

    public Duck(String name, int age, int weight, String color) {
        Animal.setName(name);
        Animal.setAge(age);
        Animal.setWeight(weight);
        Animal.setColor(color);
    }

    public void fly() {
        System.out.println(" Я лечу");
    }

    @Override
    public void say() {
        System.out.println("Я говорю Кря");
    }


}