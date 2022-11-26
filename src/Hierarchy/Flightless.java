package Hierarchy;

import java.util.Objects;

public class Flightless extends Bird {
    private String movementType;

    public Flightless(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        setMovementType(movementType);
    }

    public void Walk () {
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
        Flightless flightless = (Flightless) o;
        return Objects.equals(movementType, flightless.movementType) && getYear() == flightless.getYear() && Objects.equals(getName(), flightless.getName()) && Objects.equals(getLivingEnvironment(), flightless.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Нелетающие: [" +
                " Имя - " + getName()  +
                ", Тип передвижения - " + movementType  +
                ", Среда обитания - " + getLivingEnvironment()  +
                ", Возраст - " + getYear() +
                " года]";
    }
}
