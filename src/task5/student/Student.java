package task5.student;

import task5.course.Course;

import java.util.ArrayList;
import java.util.List;


public class Student {

    private  String firstName;
    private  String lastName;
    private final long studentId;
    private  List<Course> registeredCourses;

    public Student(String firstName, String lastName, long studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.registeredCourses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public long getStudentId() {
        return studentId;
    }

    public void addToRegisteredCourses(Course course){
        registeredCourses.add(course);
    }
}
