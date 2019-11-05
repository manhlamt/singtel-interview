package domain;

public class Chicken extends Bird {
    public Chicken() {
        super("Cluck, cluck");
    }

    public Chicken(Gender gender) {
        super("Cluck, cluck");
        if (gender == Gender.MALE) {
            super.setVoice("Cock-a-doodle-doo");
        }
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly");
    }
}
