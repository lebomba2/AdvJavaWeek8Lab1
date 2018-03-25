package lab1;

import javax.swing.*;

public abstract class Course {
    String courseName;
    String courseNumber;
    private double credits;


    public abstract void setCredits(double credits);


    // in all 3 but lok different
    public abstract void setCourseName(String courseName);

    public String getCourseNumber() {
        return courseNumber;
    }

    public  String getCourseName() {
        return courseName;
    }


}
