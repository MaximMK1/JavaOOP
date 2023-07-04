package OOP.HW.HomeWork1;

public class Cow extends Animals{

    int milkPerformance;

    public Cow (String animal, String name, int age, double weight, String typeAnimal, int milkPerformance){
        super(animal, name, age,  weight, typeAnimal);
        this.milkPerformance = milkPerformance;
    }

    @Override
    public String toString() {
        return "Животное = " + animal
                + ", Кличка = " + name
                + ", Возраст =" + age
                + ", Вес =" + weight
                + ", Отряд = "+ typeAnimal
                + ", Сколько дает молока в день = "+ milkPerformance;
    }

    @Override
    public void voice() {
        System.out.println("Мууу!");
    }

}
