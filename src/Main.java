import animals.Animal;
import animals.fly.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.Commands;
import factory.AnimalFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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
                        while (true) {
                            type = scanner.next().trim().toLowerCase();
                            scanner.nextLine();
                            Animals.add(AnimalFactory.add1Animal(scanner, type));
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
}