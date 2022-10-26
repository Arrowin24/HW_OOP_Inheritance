package animals;

public abstract class Mammal extends Animal {
    private String habitat;
    private double speed;

    public Mammal(String name, int age, String habitat, double speed) {
        super(name, age);
        if (!habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            habitat = "Not determined!";
        }
        setSpeed(speed);
    }

    public void walk() {
        System.out.println("Ходить туда-сюда....");
    }

    public String getHabitat() {
        return habitat;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    @Override
    public void sleep() {
        System.out.println("Посплю в теплом месте");
    }

    @Override
    public void move() {
        System.out.println("Прошел от одной точки до другой");
    }
}
