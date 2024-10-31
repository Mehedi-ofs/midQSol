package com.example.midqsolveray;

public class Student {
    private int studentID; int scholarshipRate;
    private  boolean hasScholarship;

    public Student(int studentID, int scholarshipRate, boolean hasScholarship) {
        this.studentID = studentID;
        this.scholarshipRate = scholarshipRate;
        this.hasScholarship = hasScholarship;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", scholarshipRate=" + scholarshipRate +
                ", hasScholarship=" + hasScholarship +
                '}';
    }
}
