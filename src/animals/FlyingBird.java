package animals;

import java.util.Objects;

public class FlyingBird extends Bird {
    private final boolean isFlying = true;

    public FlyingBird(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void walk() {
        System.out.println("Я хожу по земле...");
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass(),this.getName(),this.getAge(),this.getHabitat(),this.isFlying);
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }

    @Override
    public void move() {
        System.out.println("Пролетел от одной точки к другой");
    }
}
