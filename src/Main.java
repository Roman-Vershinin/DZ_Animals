import animals.Animal;
import animals.fly.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean IS_TRUE = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Animals = new ArrayList<>();
        String inpWord = "";

        while (true) {
            System.out.println("Введите add/list/exit");
            inpWord = scanner.next().trim().toLowerCase();
            scanner.nextLine();

           try {
               Commands word = Commands.valueOf(inpWord.toUpperCase());
           }catch (IllegalArgumentException e) {
               System.out.println("Введено некорректное значение");
               continue;

           }


            Commands word = Commands.valueOf(inpWord.toUpperCase());
            if (word != null) {
                switch (word) {
                    case ADD:
                        System.out.println("Введите вид животного (cat/dog/duck) ");
                        String type;
                        while (IS_TRUE) {
                            type = scanner.next().trim().toLowerCase();
                            switch (type) {
                                case "cat":
                                    Animals.add(addAnimal(scanner, "cat"));
                                    break;
                                case "dog":
                                    Animals.add(addAnimal(scanner, "dog"));
                                    break;
                                case "duck":
                                    Animals.add(addAnimal(scanner, "duck"));
                                    break;
                                default:
                                    System.out.println("Введено некорректное значение, введите заново");
                                    continue;
                            }
                            break;
                        }
                    case LIST:
                        for (String animal : Animals) {
                            System.out.println(animal);
                        }
                        System.out.println(" ");
                        break;


                    case EXIT:
                        System.exit(0);

                    default:
                        System.out.println("Введено некорректное значение, введите заново");
                        break;
                }
            }


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
        IS_TRUE = false;
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
    public static String addAnimal(Scanner scanner, String animalType) {
        input(scanner);
        Animal animal = null;
        if(animalType.equals("cat")) {
            animal = new Cat(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        } else if(animalType.equals("dog")) {
            animal = new Dog(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        } else if(animalType.equals("duck")) {
            animal = new Duck(Animal.getName(), Animal.getAge(), Animal.getWeight(), Animal.getColor());
        }
        if(animal != null) {


            animal.say();
            return animal.toString();

        } else {
            return null;
        }

    }
}