import domain.Bird;
import domain.Chicken;
import domain.Duck;

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
    }
}
