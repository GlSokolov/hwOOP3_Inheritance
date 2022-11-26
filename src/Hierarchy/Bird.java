package Hierarchy;

import java.util.Objects;

public abstract class Bird extends Animals{
    private String livingEnvironment;


    public Bird (String name, int year, String livingEnvironment) {
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
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
