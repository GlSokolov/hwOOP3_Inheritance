public class Train extends Transport {
    private int cost;
    private int timeTravel;
    private String nameStation;
    private String endingStation;
    private int totalWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, int cost, int timeTravel, String nameStation, String endingStation, int totalWagons) {
        super(brand, model, year, country, color, maxSpeed);
        setCost(cost);
        setTimeTravel(timeTravel);
        setNameStation(nameStation);
        setEndingStation(endingStation);
        setTotalWagons(totalWagons);
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        if (cost <=0) {
            System.out.println(" <Некорректное значение> ");
        } else {
        this.cost = cost;}
    }

    public int getTimeTravel() {
        return timeTravel;
    }
    public void setTimeTravel(int timeTravel) {
        if (timeTravel <=0) {
            System.out.println(" <Некорректное значение> ");
        } else {
            this.timeTravel = timeTravel;}
    }

    public String getNameStation() {
        return nameStation;
    }
    public void setNameStation(String nameStation) {
        if (nameStation == null || nameStation.isBlank() || nameStation.isEmpty()) {
            this.nameStation = " <Некорректное значение> ";
        } else {
            this.nameStation = nameStation;}
    }

    public String getEndingStation() {
        return endingStation;
    }
    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isBlank() || endingStation.isEmpty()) {
            this.endingStation = " <Некорректное значение> ";
        } else {
            this.endingStation = endingStation;};
    }

    public int getTotalWagons() {
        return totalWagons;
    }
    public void setTotalWagons(int totalWagons) {
        if (totalWagons <= 0) {
            System.out.println(" <Некорректное значение> ");
        } else {
            this.totalWagons = totalWagons;};
    }

    @Override
    public void refill() {
        System.out.println("Поезд "+getBrand()+" заправляется только дизелем");
    }

    @Override
    public String toString() {
        return "Поезд - '" + getBrand() +
                "' | Модель - '" + getModel() +
                "' | год выпуска - " + getYear() +
                "г. | скорость поезда -  " + getMaxSpeed() +
                "км*ч, | цена билета - " + cost +
                "руб. | время поездки - " + timeTravel +
                "ч. | станция отбытия - " + nameStation +
                " | станция прибытия - " + endingStation +
                " | всего вагонов - " + totalWagons
                ;
    }
}
