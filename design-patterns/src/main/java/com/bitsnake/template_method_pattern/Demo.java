package com.bitsnake.template_method_pattern;

public class Demo {

    public static void main(String[] args) {
        System.out.println("*** Template Method Demo ***");

        BasicEngineering computerScience = new ComputerScience();
        computerScience.completeCourse();
        System.out.println();

        BasicEngineering preferredCourse = new Electronics();
        preferredCourse.completeCourse();
    }

}
