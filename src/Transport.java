public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {this.brand = "<Информация отсутствует>";}

    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {this.model = "<Информация отсутствует>";}
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {this.color = "<Информация отсутствует>";}
    }
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 60) {
            this.maxSpeed = maxSpeed;
        } else {this.maxSpeed = 40;}
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void refill ();

}
