package animals;

public abstract class Animal {
    private static String name;
    private static int age;
    private static int weight;
    private static String color;
    private static String pet;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animal.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Animal.weight = weight;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Animal.color = color;
    }

    public static String getPet() {
        return pet;
    }

    public static void setPet(String pet) {
        Animal.pet = pet;
    }

    public void say() {
        System.out.println("Я говорю ");
    }

    public void go() {
        System.out.println("Я иду ");
    }

    public void drink() {
        System.out.println("Я пью ");
    }

    public void eat() {
        System.out.println("Я ем ");
    }

    @Override
    public String toString() {

        int ostatok = 0;
        ostatok = age % 10;

        if (ostatok == 1) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " год" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else if (ostatok >=2 && ostatok <=4) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " года" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else if (age >= 11 && age <= 19){
            pet = "Привет! Меня зовут " + name + ", мне " + age + " лет" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else
            pet = "Привет! Меня зовут " + name + ", мне " + age + " лет" + ", я вешу " + weight + " кг, мой цвет - " + color;
        return pet;
    }
}