package pattern.singleton;

/**
 *
 * Double-checked locking
 */
public class MercedesBenz {
    private static MercedesBenz mercedesBenz;
    int numberOfInstance;
    private MercedesBenz() {
        numberOfInstance++;
    }

    public static MercedesBenz getMercedesBenz() {
        if (mercedesBenz == null) {
            synchronized (MercedesBenz.class) {
                if (mercedesBenz == null) {
                    mercedesBenz = new MercedesBenz();
                }
            }
        }
            return  mercedesBenz;
    }


}
