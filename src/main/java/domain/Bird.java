package domain;

public class Bird extends Animal implements WalkingAnimal, FlyingAnimal {
    public Bird(String voice) {
        super(voice);
    }

    public Bird() {
        super();
    }

    public void sing() {
        System.out.println("I'm singing ... chirp chirp !!!");
    }
}
