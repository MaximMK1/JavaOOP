package OOP.HW.HomeWork1;

public class Program {
    public static void main(String[] args) {

        Cat cat1 = new Cat ("Кошка","Васька", 3, 4.5, "хищник", "Спокойный");
        Dog dog1 = new Dog ("Собака","Шарик", 2, 6, "хищник", "Овчарка");
        Cow cow1 = new Cow ("Корова", "Манька", 5, 150,"травоядный", 10);

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(cow1);

        Animals [] arrayAnimals = new Animals [] {cat1, dog1, cow1};

        for (Animals animal: arrayAnimals) {
            animal.eat(5);
        }

        cat1.voice();
        dog1.voice();
        cow1.voice();

    }
}
