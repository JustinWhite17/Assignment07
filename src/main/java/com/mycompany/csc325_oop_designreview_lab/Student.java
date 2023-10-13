/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */


public class Student extends Human {
    private double gpa;
    private String address;

    public Student(String name, short age) {
        super(name, age);
    }

    // Overridden methods

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setters

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.0.");
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }
}

