import domain.Bird;
import domain.Cat;
import domain.Chicken;
import domain.Dog;
import domain.Dolphin;
import domain.Duck;
import domain.Fish;
import domain.Gender;
import domain.Parrot;

import javax.sound.midi.Soundbank;

public class Solution {
    public static void main (String[] args) {
        System.out.println("Question 1: ");
        final Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("Question 2: ");
        final Duck duck = new Duck();
        final Chicken chicken = new Chicken();
        duck.says();
        chicken.says();
        duck.swim();
        try {
            chicken.fly();
        } catch (UnsupportedOperationException e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }

        System.out.println("Question 3: ");
        final Chicken rooster = new Chicken(Gender.MALE);
        rooster.says();

        System.out.println("Question 4: ");
        final Parrot woofParrot = new Parrot();
        woofParrot.mimic(Dog.VOICE);
        woofParrot.says();

        final Parrot meowParrot = new Parrot();
        meowParrot.mimic(Cat.VOICE);
        meowParrot.says();

        final Parrot cockParrot = new Parrot();
        cockParrot.mimic(Chicken.FEMALE_VOICE);
        cockParrot.says();

        final Parrot wildParrot = new Parrot();
        wildParrot.says();

        System.out.println("Section B, Question 1:");
        final Fish fish = new Fish();
        fish.swim();
        try {
            fish.says();
        } catch (UnsupportedOperationException e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }

        System.out.println("Section B, Question 2:");
        final Fish shark = Fish.makeShark();
        final Fish clownFish = Fish.makeClownFish();
        System.out.println(String.format("Shark is %s and %s", shark.getSize(), shark.getColor()));
        System.out.println(String.format("ClownFish is %s and %s", clownFish.getSize(), clownFish.getColor()));
        System.out.println("Lets make jones");
        shark.makeJokes();
        clownFish.makeJokes();
        System.out.println("Lets Eat other fishes");
        shark.eatOtherFish();
        clownFish.eatOtherFish();

        System.out.println("Section B, Question 3:");
        final Dolphin dolphin = new Dolphin();
        dolphin.swim();
    }
}
