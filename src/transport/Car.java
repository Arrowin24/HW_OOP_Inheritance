package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private boolean isAutomatTransmission;

    private String registrationNumber;
    private boolean isSummerTires;
    private int seats;

    public Car() {
        super();
        engineVolume = 1.5;
        seats = 2;
        setRegistrationNumber("");
    }

    public Car(String brand, String model, int yearIssue, String country, String color, double maxSpeed,
               double engineVolume, boolean isAutomatTransmission,
               String registrationNumber, boolean isSummerTires, int seats) {
        super(brand, model, yearIssue, country, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.isAutomatTransmission = isAutomatTransmission;
        setRegistrationNumber(registrationNumber);
        this.isSummerTires = isSummerTires;
        this.seats = seats;
    }

    //ДЗ 2 добавление заправки
    @Override
    public void refill() {
        if (getModel() == "Электрокар") {
            System.out.println("Необходимо найти зарядку на электропарковке!");
        } else {
            System.out.println("Машина заправляется БЕНЗИНОМ и ДИЗЕЛЕМ");
        }
    }

    // Реализация методов из другой дз
    public void isCorrectTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (isSummerTires == (currentMonth > 4 && currentMonth < 10)) {
            System.out.println("Резина правильная!");
        } else {
            System.out.println("Срочно замените резину!!!!!");
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.matches("\\S\\d\\d\\d\\S\\S\\d\\d\\d")) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Некорректный номер регистрации. Установлен по умолчанию номер: х000хх000");
            this.registrationNumber = "х000хх000";
        }
    }

    public void setAutomatTransmission(boolean automatTransmission) {
        isAutomatTransmission = automatTransmission;
    }


    public void setTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        isSummerTires = currentMonth > 4 && currentMonth < 10;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public boolean isAutomatTransmission() {
        return isAutomatTransmission;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isSummerTires() {
        return isSummerTires;
    }

    public String toString() {
        return super.toString() + String.format(", engine Volume: %f, Registration Number: %s", engineVolume, registrationNumber);
    }
}
