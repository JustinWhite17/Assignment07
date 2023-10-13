package com.mycompany.csc325_oop_designreview_lab;

class Senior extends Student {
    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior students must have at least 85 credits.");
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + ", Credits (Senior): " + credits;
    }
}