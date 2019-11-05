package domain;

public class Cat extends Animal implements WalkingAnimal {
    public static String VOICE = "Meow";

    public Cat() {
        super(VOICE);
    }
}
