import domain.Bird;
import domain.Chicken;
import domain.Duck;
import domain.Gender;

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
    }
}
