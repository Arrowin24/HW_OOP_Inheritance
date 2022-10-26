package animals;

//Реализация третьей части домашнего задания
public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Jo", 2, "Africa", 45, "травка");
        Herbivore giraffe = new Herbivore("Joh", 1, "Africa", 30, "листья");
        Herbivore horse = new Herbivore("John", 3, "Russia", 45, "зерно");

        Predator hyena = new Predator("Гиена", 2, "Africa", 40, "трупики");
        Predator tiger = new Predator("Тигр", 2, "Africa", 40, "мясо");
        Predator bear = new Predator("Мишка", 2, "Africa", 40, "мясо и ягоды");

        Amphibian frog = new Amphibian("Лягушка", 1, "");
        Amphibian snake = new Amphibian("Уж пресноводный", 2, "Водичка");

        NotFlyingBird peacock = new NotFlyingBird("Павлин", 1, "Озеро");
        NotFlyingBird penguin = new NotFlyingBird("Пингвин", 1, "Ледник");
        NotFlyingBird dodo = new NotFlyingBird("Додо", 1, "Без понятия");

        FlyingBird seagull = new FlyingBird("Чайка", 1, "Берег");
        FlyingBird albatross = new FlyingBird("Альбатрос", 1, "");
        FlyingBird falcon = new FlyingBird("Сокол", 1, "Небо");

        FlyingBird falcon2 = new FlyingBird("Сокол", 1, "Небо");

        System.out.println("Два сокола являются ли соколами: "+falcon.equals(falcon2));
        gazelle.eat();
        bear.hunt();
        snake.sleep();
        seagull.walk();
        peacock.move();
        albatross.move();
    }
}
