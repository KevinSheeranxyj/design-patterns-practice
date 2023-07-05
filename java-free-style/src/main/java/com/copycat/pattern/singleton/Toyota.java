package pattern.singleton;

/**
 * Singleton Example
 */
final class Toyota {
    static Toyota toyota;
    int numberOfInstance = 0;

    private Toyota() {
        numberOfInstance++;
        System.out.println();
    }

    /**
     *
     * Lazy Initialization
     * @return
     */
    public static synchronized Toyota getToyota() {
        if (toyota == null) {
            toyota = new Toyota();
        }
        return toyota;
    }

}
