package domain;

public class Fish extends Animal {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish does not walk");
    }

    @Override
    public void says() {
        throw new UnsupportedOperationException("Fish does not say");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}
