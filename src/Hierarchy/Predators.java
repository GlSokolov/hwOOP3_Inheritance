package Hierarchy;

import java.util.Objects;

public class Predators extends Mammal{
    String typeOfFood;

    public Predators(String name, int year, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, year, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public void Hunt() {
        System.out.println("");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = " <Некорректное значение> ";
        } else {
        this.typeOfFood = typeOfFood;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return  Objects.equals(typeOfFood, predators.typeOfFood) && getTravelSpeed() == predators.getTravelSpeed() && Objects.equals(getLivingEnvironment(), predators.getLivingEnvironment()) && getYear() == predators.getYear() && Objects.equals(getName(), predators.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Хищник: [" +
                " Имя - " + getName()  +
                ", Тип пищи - " + typeOfFood  +
                ", Среда обитания - " + getLivingEnvironment()  +
                ", Скорость бега - " + getTravelSpeed() +
                ", Возраст -" + getYear() +
                "года]";
    }
}
