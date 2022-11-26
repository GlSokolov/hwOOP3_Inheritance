package Hierarchy;

import java.util.Objects;

public class Animals {
    private String name;
    private int year;

    public Animals(String name, int year) {
        setName(name);
        setYear(year);
    }

    public void Eat () {
        System.out.println("");
    }
    public void Sleep () {
        System.out.println("");
    }
    public void Go () {
        System.out.println("");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = " <Некорректное значение> ";
        } else {
        this.name = name;}
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 0) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

}
