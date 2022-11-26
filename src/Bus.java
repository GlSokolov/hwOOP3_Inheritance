public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Автобус "+getBrand()+" заправляется дизелем/бензином (В зависимости от типа вашего двигателя)");
    }

    @Override
    public String toString() {
        return "Автобус - '"+getBrand()+
                "' | модель - '"+getModel()+
                "' | год выпуска - "+getYear()+
                "г. | страна производитель - "+getCountry()+
                " | цвет - "+getColor()+
                " | макс.скорость - "+getMaxSpeed()+
                "км*ч.";
    }
}
