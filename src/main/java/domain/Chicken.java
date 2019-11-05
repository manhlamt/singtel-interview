package domain;

public class Chicken extends Bird {
    public static String MALE_VOICE = "Cock-a-doodle-doo";
    public static String FEMALE_VOICE = "Cluck, cluck";
    public Chicken() {
        super(FEMALE_VOICE);
    }

    public Chicken(Gender gender) {
        super(FEMALE_VOICE);
        if (gender == Gender.MALE) {
            super.setVoice(MALE_VOICE);
        }
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Chicken cannot fly");
    }
}
