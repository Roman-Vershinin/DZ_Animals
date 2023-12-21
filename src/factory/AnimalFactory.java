package factory;
import animals.Animal;
import animals.fly.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import java.util.Scanner;
public class AnimalFactory {
    public static String add1Animal(Scanner scanner, String type) {
        switch (type) {
            case "cat":
               return addAnimal(scanner, "cat");

            case "dog":
                return addAnimal(scanner, "dog");

            case "duck":
                return addAnimal(scanner, "duck");

            default:
                System.out.println("Введено некорректное значение, введите заново");
                type = scanner.next().trim().toLowerCase();
                scanner.nextLine();
                return add1Animal(scanner,type);
        }
    }
    private static String addAnimal(Scanner scanner, String animalType) {
        input(scanner);
        Animal animal = null;
        if (animalType.equals("cat")) {
            animal = new Cat(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        } else if (animalType.equals("dog")) {
            animal = new Dog(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        } else if (animalType.equals("duck")) {
            animal = new Duck(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        }
        if (animal != null) {

            animal.say();
            return animal.toString();

        } else {
            return null;
        }
    }

    private static void input(Scanner scanner) {
        System.out.println("Введите имя животного");
        Animal.setName(scanner.next());

        scanner.nextLine();

        System.out.println("Введите возраст животного");
        ScannerType(scanner, "age");

        System.out.println("Введите вес животного");
        ScannerType(scanner, "weight");


        System.out.println("Введите цвет животного");
        Animal.setColor(scanner.next());

    }
    private static void ScannerType(Scanner scanner, String type) {
        while (true) {
            if (scanner.hasNextInt()) {
                int inputValue = Integer.parseInt(scanner.nextLine());
                if (inputValue < 0) {
                    System.out.println("Вы ввели отрицательное значение, попробуйте снова");
                } else {
                    switch (type) {
                        case "age":
                            Animal.setAge(inputValue);
                            break;
                        case "weight":
                            Animal.setWeight(inputValue);
                            break;
                    }
                    break;
                }
            } else {
                System.out.println("Вы ввели некорректные данные, попробуйте снова");
                scanner.nextLine();
            }
        }
    }
}
