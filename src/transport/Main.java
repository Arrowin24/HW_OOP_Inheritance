package transport;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Focus", 2001, "German", "Blue", 120, 4, true, "g054ff544", true, 6);
        Car myCar2 = new Car();
        Train swallow = new Train("Ласточка", "B-901", 2011, "Russia", 301, 3500, 150, "Белорусский вокзал", "Минск-Пассажирская станция", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Russia", 270, 1700, 150, "Ленинградский вокзал", "Минск-Пассажирская станция", 8);
        Bus b11 = new Bus();
        Bus b13 = new Bus("B13", "Mazd", 2010, "Russia", "Green", 50);
        Bus b15 = new Bus("B15", "Mazd", 2015, "Russia", "Blue", 55);

        System.out.println(myCar);
        System.out.println(myCar2);
        System.out.println(swallow);
        System.out.println(leningrad);
        System.out.println(b11);
        System.out.println(b13);
        System.out.println(b15);

        //Проверка реализации абстрактного метода 2 домашка
        myCar.refill();
        swallow.refill();
        b11.refill();


    }
}