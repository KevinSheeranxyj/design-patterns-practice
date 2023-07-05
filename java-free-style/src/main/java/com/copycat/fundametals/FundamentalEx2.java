package fundametals;

/**
 *
 * Prefix with 0x or 0X, it will stand for Hexadecimal presentation
 */
public class FundamentalEx2 {

    public static void main(String[] args) {
        int a = 0x12;
        int b = 0x1E;
        int c = 0X1F; // ok
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
