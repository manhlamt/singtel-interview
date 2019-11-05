package domain;

public interface SwimmingAnimal {
    default public void swim() {
        System.out.println("I am swimming");
    }
}
