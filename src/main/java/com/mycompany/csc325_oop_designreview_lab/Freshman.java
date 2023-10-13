package com.mycompany.csc325_oop_designreview_lab;

class Freshman extends Student {
    private int credits;

    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + ", Credits (Freshman): " + credits;
    }
}

