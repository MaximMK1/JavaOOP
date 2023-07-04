package OOP.HW.HomeWork1;

public class Animals {

    String animal;
    String name;
    int age;
    double weight;
    String typeAnimal;

    public Animals (String animal, String name, int age, double weight, String typeAnimal) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.typeAnimal = typeAnimal;
    }

    public void voice(){
        System.out.println("Голос!");
    }

    public void run(){
        System.out.println("Бежать!");
    }

    public void eat(int food){
        System.out.println(animal + " " + name + " Поела! Омномном");
    }
}


