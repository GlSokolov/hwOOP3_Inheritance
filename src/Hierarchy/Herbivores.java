package Hierarchy;

import java.util.Objects;

public class Herbivores extends Mammal{
    private String typeOfFood;

    public Herbivores(String name, int year, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, year, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public void Pasture () {
        System.out.println("");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank() || typeOfFood.isEmpty()) {
            this.typeOfFood = " <Некорректное значение> ";
        } else {
        this.typeOfFood = typeOfFood;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores herbivores = (Herbivores) o;
        return Objects.equals(typeOfFood, herbivores.typeOfFood) && getTravelSpeed() == herbivores.getTravelSpeed() && Objects.equals(getLivingEnvironment(), herbivores.getLivingEnvironment()) && getYear() == herbivores.getYear() && Objects.equals(getName(), herbivores.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Травоядное: [" +
                " Имя - " + getName()  +
                ", Тип пищи - " + typeOfFood  +
                ", Среда обитания - " + getLivingEnvironment()  +
                ", Скорость бега - " + getTravelSpeed() +
                ", Возраст -" + getYear() +
                " года]";
    }
}
