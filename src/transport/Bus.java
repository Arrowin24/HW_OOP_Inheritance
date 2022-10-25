package transport;

public class Bus extends Transport {
    public Bus() {
        super();
    }

    public Bus(String brand, String model, int yearIssue, String country, String color, double maxSpeed) {
        super(brand, model, yearIssue, country, color, maxSpeed);
    }

    //ДЗ 2 добавление заправки
    @Override
    public void refill() {
        System.out.println("Автобус заправляется БЕНЗИНОМ и ДИЗЕЛЕМ");
    }
}
