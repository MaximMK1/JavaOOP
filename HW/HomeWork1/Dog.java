package OOP.HW.HomeWork1;

public class Dog extends Animals {

    String breed;

    public Dog (String animal, String name, int age, double weight, String typeAnimal, String breed){
        super (animal, name, age, weight, typeAnimal);
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Животное = " + animal
                + ", Кличка = " + name
                + ", Возраст =" + age
                + ", Вес =" + weight
                + ", Отряд = " + typeAnimal
                + ", Порода = " + breed;
    }

    @Override
    public void voice() {
        System.out.println("Р-р-р!");
    }
}
