import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends Transport {
    double engineVolume;

    private final String transmission;
    private String bodyType;
    private final  String number;
    private int numberOfSeats;
    private final  String wheel;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String transmission, String bodyType, String number, int numberOfSeats, String wheel) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        setBodyType(bodyType);
        this.number = number;
        setNumberOfSeats(numberOfSeats);
        this.wheel = wheel;
    }

    public class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key (String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "<Информация недоступна>";
            }else{this.remoteEngineStart = remoteEngineStart;}
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "<Информация недоступна>";
            }else{this.keylessAccess = keylessAccess;}

        }
    }
    public class Insurance {
        private LocalDate srokDeystviya;
        private int cost;
        private String number;

        public Insurance(LocalDate srokDeystviya, int cost, String number) {
            this.srokDeystviya = srokDeystviya;
            if (cost <= 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "<Введите номер страховки>";
            } else {
                this.number = number;
            }
        }

        public String checkCorrectNumber(String number) {
            if (Pattern.matches("[0-9]{9}", number)) {
                return number;
            } else {
                return "Номер страховки некорректный";
            }
        }

        public LocalDate checkSrokDeystviya(LocalDate srokDeystviya) {
            if (srokDeystviya.isBefore(LocalDate.now()) || srokDeystviya.isEqual(LocalDate.now())) {
                System.out.println("Срок действия страховки кончился");
            }
            return srokDeystviya;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getNumber() {
        return number;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getWheel() {
        return wheel;
    }


    public void setBodyType(String bodyType) {
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = "<Информация не указана>";
        } else {this.bodyType = bodyType; }
    }
    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 0;
        } else {this.numberOfSeats = numberOfSeats; }
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль"+getBrand()+"можно заправлять бензином/дизелем/электричеством (В зависимости от типа вашего двигателся)");
    }
}
