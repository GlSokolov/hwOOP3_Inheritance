package Hierarchy;

import java.util.Objects;

public class Flying extends Bird {
    private String movementType;

    public Flying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        setMovementType(movementType);
    }

    public void Fly() {
        System.out.println("");
    }

    public String getMovementType() {
        return movementType;
    }
    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) {
            this.movementType = " <Некорректное значение> ";
        } else {
        this.movementType = movementType;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType) && getYear() == flying.getYear() && Objects.equals(getName(), flying.getName()) && Objects.equals(getLivingEnvironment(), flying.getLivingEnvironment());
    }

    @Override
    public String toString() {
        return "Летающие: [" +
                " Имя - " + getName()  +
                ", Тип передвижения - " + movementType  +
                ", Среда обитания - " + getLivingEnvironment()  +
                ", Возраст - " + getYear() +
                " года]";
    }
}
