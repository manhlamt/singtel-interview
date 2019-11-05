package domain;

public class Dog extends Animal implements WalkingAnimal{
    public static String VOICE = "Woof, woof";

    public Dog() {
        super(VOICE);
    }
}
