package domain;

public interface FlyingAnimal {
    default public void fly() {
        System.out.println("I am flying");
    }
}
