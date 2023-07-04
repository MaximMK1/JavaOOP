package OOP.HW.HomeWork1;

public class Cat extends Animals {

    String character;

    public Cat(String animal, String name, int age, double weight, String typeAnimal, String character){
        super (animal, name, age, weight, typeAnimal);
        this.character = character;
    }

    @Override
    public String toString() {
        return "Животное = " + animal
                + ", Кличка = " + name
                + ", Возраст =" + age
                + ", Вес =" + weight
                + ", Отряд = "+ typeAnimal
                + ", Характер = "+ character;
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}
