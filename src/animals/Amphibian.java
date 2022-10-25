package animals;

import java.util.Objects;

public class Amphibian extends Animal {
    private String habitat;

    public Amphibian(String name, int age, String habitat) {
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

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass(),this.getName(),this.getAge(),this.getHabitat());
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает всякую околоводную мелочь...");
    }

    @Override
    public void sleep() {
        System.out.println("Отдыхаю в сыром месте");
    }
}
