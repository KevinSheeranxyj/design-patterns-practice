package com.copycat.generics;

public class ArrayUtils {
    public static <T> void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"James", "Catalyst", "Mojito"};
        Integer[] integers = new Integer[]{1, 2, 32, 3231, 2133};

        print(strs);
        print(integers);
    }

}
