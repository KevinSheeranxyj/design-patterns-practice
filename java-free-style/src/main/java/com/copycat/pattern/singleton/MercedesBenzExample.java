package pattern.singleton;

public class MercedesBenzExample {

    public static void main(String[] args) {
        MercedesBenz mercedesBenz = MercedesBenz.getMercedesBenz();
        MercedesBenz mercedesBenz1 = MercedesBenz.getMercedesBenz();
        System.out.println(mercedesBenz.numberOfInstance);
        System.out.println(mercedesBenz1.numberOfInstance);
    }
}
