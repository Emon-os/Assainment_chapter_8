package Exercise_18;

import java.util.Random;

public class Die {
    private static Random generator = new Random();

    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
        roll();
    }

    public void roll() {
        value = generator.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        die1.roll();
        die2.roll();

        System.out.println("Die 1 value: " + die1.getValue());
        System.out.println("Die 2 value: " + die2.getValue());
    }
}

