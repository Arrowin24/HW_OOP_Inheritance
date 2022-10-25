package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String food;

    public Herbivore(String name, int age, String habitat, double speed, String food) {
        super(name, age, habitat, speed);
        if (!food.isBlank()) {
            this.food = food;
        } else {
            this.food = "Травка";
        }
    }

    public void graze() {
        System.out.println("Ем травку на улице...");
    }

    @Override
    public void eat() {
        System.out.println("Моя еда " + food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass(),this.getName(),this.getAge(),this.getHabitat(),this.getSpeed());
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }
}
