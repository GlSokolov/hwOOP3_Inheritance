package Hierarchy;

import java.util.Objects;

public class Amphibian extends Animals{
    private String livingEnvironment;

    public Amphibian(String name, int year, String livingEnvironment) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);;
    }

    public void Hunt() {
        System.out.println("");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()){
            this.livingEnvironment = " <Некорректное значение> ";
        } else {
        this.livingEnvironment = livingEnvironment;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment) && getYear() == amphibian.getYear() && Objects.equals(getName(), amphibian.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    @Override
    public String toString() {
        return "Земноводное: [" +
                " Имя - " + getName() +
                ", Среда обитания - " + livingEnvironment +
                ", Возраст - " + getYear() +
                " года]";
    }
}
