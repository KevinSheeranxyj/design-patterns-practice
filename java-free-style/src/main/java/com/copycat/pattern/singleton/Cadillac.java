package pattern.singleton;

/**
 *
 * Eager Initialization
 *
 * Pros:
 *
 *
 */
public class Cadillac {
    private static final Cadillac cadillac = new Cadillac();
    int numberOfInstance = 0;
    private Cadillac() {
        numberOfInstance ++;
    }

    public static Cadillac getCadillac() {
        return cadillac;
    }
}
