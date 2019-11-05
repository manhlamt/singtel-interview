package domain;

public class Fish extends Animal {
    private String color;

    private Size size;

    private boolean herbivore;

    private boolean funny;

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish does not walk");
    }

    @Override
    public void says() {
        throw new UnsupportedOperationException("Fish does not say");
    }

    public void makeJokes() {
        if (this.isFunny()) {
            System.out.println("Ha ha ha");
        } else {
            System.out.println("Nope");
        }
    }

    public void eatOtherFish() {
        if (this.isHerbivore()) {
            System.out.println("Fishes are friends");
        } else {
            System.out.println("Yum yum");
        }
    }

    public void swim() {
        System.out.println("I am swimming");
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    public void setHerbivore(boolean herbivore) {
        this.herbivore = herbivore;
    }

    public boolean isFunny() {
        return funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public static Fish makeShark() {
        final Fish fish = new Fish();
        fish.setSize(Size.LARGE);
        fish.setColor("grey");
        fish.setHerbivore(false);
        fish.setFunny(false);

        return fish;
    }

    public static Fish makeClownFish() {
        final Fish fish = new Fish();
        fish.setSize(Size.SMALL);
        fish.setColor("orange");
        fish.setHerbivore(true);
        fish.setFunny(true);

        return fish;
    }
}
