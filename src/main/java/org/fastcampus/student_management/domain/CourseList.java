package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    private final List<Course> courseList;

    public CourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void changeFee(int fee) {
        for (Course course : courseList) {
            if (course.getDayOfWeek() == DayOfWeek.SATURDAY || course.getDayOfWeek() == DayOfWeek.SUNDAY) {
                course.changeFee((int) (fee * 1.5));
            }
            else {
                course.changeFee(fee);
            }
        }
    }
}
