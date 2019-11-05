package domain;

public interface WalkingAnimal {
    default public void walk() {
        System.out.println("I am walking");
    }
}
