package animals.fly;

import animals.Animal;

public class Duck extends Animal implements IFlying {

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