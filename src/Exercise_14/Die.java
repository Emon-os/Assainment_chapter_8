package Exercise_14;

import java.util.Random;

public class Die
{
    // Instance Variables
    private static Random generator;			// This variable is shared between all instances of the Die class (all objects will have same values
    private int sides;

    // Constructors
    /**
     Constructs a die with a given number of sides.
     @param s the number of sides, e.g. 6 for a normal die
     */
    public Die(int s)
    {
        sides = s;
        generator = new Random();
    }

    // Methods
    /**
     Simulates a throw of the die
     @return the face of the die
     */
    public int cast()
    {
        return 1 + generator.nextInt(sides);
    }
}
