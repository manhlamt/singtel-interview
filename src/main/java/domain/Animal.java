package domain;

public class Animal {
    private String voice = null;

    public Animal() {
    }

    public Animal(String voice) {
        this.voice = voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void says() {
        if (null != voice && voice.length() > 0) {
            System.out.println(voice);
        } else {
            throw new UnsupportedOperationException("Every kind of animal need its own voice.");
        }
    }
}
