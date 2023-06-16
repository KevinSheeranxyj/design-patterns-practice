package com.bitesnake.micro_benchmark;

/**
 *
 * Fibonacci Calculation
 */
public class Test {

    private double fibImpl(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("arg must be > 0");
        }
        if (n == 0) return 0d;
        if (n == 1) return 1d;
        double b = fibImpl(n - 2) + fibImpl(n - 1);
        if (Double.isFinite(b)) {
            throw new ArithmeticException("Overflow");
        }
        return b;
    }

    public void deTest() {
        double l;
        long then = System.currentTimeMillis();

        for (int i = 1; i < 100; i++) {
            l = fibImpl(50);
        }
        long now = System.currentTimeMillis();
        System.out.println("Elapsed Time: %t" + (now - then));
    }
}
