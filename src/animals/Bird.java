package animals;

public abstract class Bird extends Animal {
    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        if (!habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "Not determined!";
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void hunt() {
        System.out.println("Высматриваю добычу...");
    }

    @Override
    public void eat() {
        System.out.println("Моя еда все подряд...");
    }

    @Override
    public void sleep() {
        System.out.println("Устроился в гнезде");
    }
}
