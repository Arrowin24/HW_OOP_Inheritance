package transport;

import java.time.LocalDate;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearIssue;
    private String country;
    private String color;
    private double maxSpeed;

    // Два конструктора
    public Transport() {
        this("", "", 0, "", "", 0);
    }

    public Transport(String brand, String model, int yearIssue, String country, String color, double maxSpeed) {
        if(!brand.isBlank()){
            this.brand = brand;
        } else {
            this.brand="default";
        }
        if(!model.isBlank()){
            this.model = model;
        } else {
            this.model="default";
        }
        if(yearIssue>1900&&yearIssue<=LocalDate.now().getYear()){
            this.yearIssue = yearIssue;
        } else {
            this.yearIssue = 2000;
        }
        if(!country.isBlank()){
            this.country = country;
        } else {
            this.country="default";
        }
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
