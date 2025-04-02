import java.util.ArrayList;

public class TheLionAndTheCat {
    public static void main(String[] ray) {
        System.out.println("Animals");
        System.out.println();
        System.out.println("Written by Helen Zhou");
        System.out.println();
        System.out.println();

        // Create an ArrayList that can hold Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        Animal a = new Cow("Mooooo", 5, "Cow", 800, "Black and White");
        animals.add(a);

        a = new Animal("Squeak", 2, "Mousy", "Mouse");
        animals.add(a);

        a = new Bird("Chirp Chirp", 2, "Birdy", "Bird", 5, "Red");
        animals.add(a);

        // Indexed loop
        System.out.println();
        System.out.println("Printing with a for indexed loop.");
        System.out.println("=================================");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
            System.out.println("*******************");
        }

        // For-each loop
        System.out.println();
        System.out.println("Printing with a for each loop.");
        System.out.println("==============================");
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("*******************");
        }
    }
}

class Animal {
    private String noise;
    private int age;
    private String name;
    private String typeOfAnimal;

    public Animal() {
        this("No noise given.", 0, "No name given.", "No type given.");
    }

    public Animal(String noise, int age, String name, String typeOfAnimal) {
        this.noise = noise;
        this.age = age;
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getNoise() {
        return noise;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String talk() {
        return "I am a " + getTypeOfAnimal() + ". I can " + getNoise() + ".";
    }

    public String toString() {
        return "Name = " + getName() + "\n" +
               "Age in years = " + getAge() + "\n" +
               talk() + "\n";
    }
}

class Bird extends Animal {
    private double height;
    private String color;

    public Bird(String noise, int age, String name, String typeOfAnimal, double height, String color) {
        super(noise, age, name, typeOfAnimal);
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() +
               "Color = " + getColor() + "\n" +
               "Height in inches = " + getHeight() + "\n";
    }
}

class Cow extends Animal {
    private double weight;
    private String color;

    public Cow(String noise, int age, String name, double weight, String color) {
        super(noise, age, name, "Cow");
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString() +
               "Color = " + getColor() + "\n" +
               "Weight in pounds = " + getWeight() + "\n";
    }
}
