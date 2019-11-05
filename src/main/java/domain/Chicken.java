package domain;

public class Chicken extends Bird {
    public Chicken() {
        super("Cluck, cluck");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly");
    }
}
