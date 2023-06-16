package com.bitsnake.template_method_pattern;

public class Electronics extends BasicEngineering {
    @Override
    public void completeSpecialPapers() {
        System.out.println("3. Digital Logic and Circuit Theory");
    }

    @Override
    boolean isAdditionalCourseNeeded() {
        return false;
    }
}
