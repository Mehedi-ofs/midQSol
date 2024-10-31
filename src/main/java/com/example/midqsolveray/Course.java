package com.example.midqsolveray;

public class Course {
    private String courseID;
    private int        courseType;




    public Course(String courseID, int courseType) {
        this.courseID = courseID;
        this.courseType = courseType;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCourseType() {
        return courseType;
    }

    public void setCourseType(int courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseType=" + courseType +
                '}';
    }
}
