package com.bitsnake.adapter_pattern;

public class AdapterPatternExample {

    public static void main(String[] args) {

    }

    static class Calculator {
        public double getArea(Rectangle rect) {
            return rect.width * rect.length;
        }
    }

    public static class Rectangle {
        public Integer width;
        public Integer length;
    }

}
