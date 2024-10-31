package com.example.midqsolveray;

public class RegisteredCourse {
    private  String   CourseId;
    private int courseCredit, section;

    public RegisteredCourse(String courseId, int courseCredit, int section) {
        CourseId = courseId;
        this.courseCredit = courseCredit;
        this.section = section;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "RegisteredCourse{" +
                "CourseId='" + CourseId + '\'' +
                ", courseCredit=" + courseCredit +
                ", section=" + section +
                '}';
    }
}
