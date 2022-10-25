package transport;

public class Train extends Transport {
    private double price;
    private int time;
    private String startStation;
    private String finishStation;
    private int tramCarNumber;

    public Train(String brand, String model, int yearIssue, String country, double maxSpeed, double price, int time,
                 String startStation, String finishStation, int tramCarNumber) {
        super(brand, model, yearIssue, country, "default", maxSpeed);
        this.price = price;
        this.time = time;
        this.startStation = startStation;
        this.finishStation = finishStation;
        this.tramCarNumber = tramCarNumber;
    }

    //ДЗ 2 добавление заправки
    @Override
    public void refill() {
        System.out.println("ТОЛЬКО ДИЗЕЛЬ!");
    }

    //геттеры и сеттеры собственных переменных
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public int getTramCarNumber() {
        return tramCarNumber;
    }

    public void setTramCarNumber(int tramCarNumber) {
        this.tramCarNumber = tramCarNumber;
    }


    public String toString() {
        String info = "transport.Train info: " + super.toString() + "Number of tram car: " + tramCarNumber + "\n" +
                String.format("Trip info:\n" + "Start Station: %s, Finish Station: %s, " +
                        "Trip duration: %d, Price: %f", startStation, finishStation, time, price);
        return info;
    }
}
