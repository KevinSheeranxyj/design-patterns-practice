package com.bitsnake.template_method_pattern;

public abstract class BasicEngineering {

    public final void completeCourse() {
        completeMath();
        completeSoftSkills();
        completeSpecialPapers();
        if (isAdditionalCourseNeeded()) {
            completeAdditionalPapers();
        }
    }

    private void completeAdditionalPapers() {
        System.out.println("4. Additional Papers are needed for this course");
    }

    private void completeMath() {
        System.out.println("1. Completed Mathematics");
    }

    private void completeSoftSkills() {
        System.out.println("2. Completed Soft Skills");
    }

    public abstract void completeSpecialPapers();

    boolean isAdditionalCourseNeeded() {
        return true;
    }

}
