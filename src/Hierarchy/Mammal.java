package Hierarchy;

import java.util.Objects;

public abstract class Mammal extends Animals {
    private String livingEnvironment;
    private int travelSpeed;

    public Mammal(String name, int year, String livingEnvironment, int travelSpeed) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
        setTravelSpeed(travelSpeed);
    }

    public void Walk() {
        System.out.println("");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment==null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment = " <Некорректное значение> ";
        } else {
        this.livingEnvironment = livingEnvironment;}
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }
    public void setTravelSpeed(int travelSpeed) {
        if (travelSpeed <= 0){
            this.travelSpeed = 5;
        } else {
            this.travelSpeed = travelSpeed;}
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, travelSpeed);
    }
}
