package pattern.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        System.out.println("*** Singleton Example ***");
        Toyota toyota = Toyota.getToyota();
        System.out.println(toyota.numberOfInstance);
    }
}
