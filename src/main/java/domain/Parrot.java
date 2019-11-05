package domain;

public class Parrot extends Bird {
    public static String VOICE = "Gwack, gwack";

    public Parrot() {
        super(VOICE);
    }

    public void mimic(String voice) {
        super.setVoice(voice);
    }
}
