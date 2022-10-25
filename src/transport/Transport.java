package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearIssue;
    private String country;
    private String color;
    private double maxSpeed;

    // Два конструктора
    public Transport() {
        this("default", "default", 2000, "default", "Black", 50);
    }

    public Transport(String brand, String model, int yearIssue, String country, String color, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearIssue = yearIssue;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    //Абстрактный метод длч ДЗ 2
    public abstract void refill();

    // Геттеры и сеттеры
    public void setColor(String color) {
        if (!color.isBlank()) {
            this.color = color;
        } else {
            color = "Black";
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            maxSpeed = 1;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return String.format("brand: %s, model: %s, country = %s,  year of issue: %d, color = %s", brand, model, country, yearIssue, color);
    }
}
