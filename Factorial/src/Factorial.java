public class Factorial {
    /**
     * Write a description of class Factorial here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */

    // instance variables - replace the example below with your own
    private int n;

    /**
     * Constructor for objects of class Factorial
     */
    public Factorial() {
        // initialise instance variables
        n = 1;
    }

    /**
     * Returns the factorial of the input n.
     */
    public int factorial(int n)
    {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}