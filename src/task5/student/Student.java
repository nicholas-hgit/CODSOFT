
package task5.student;

import java.util.ArrayList;
import java.util.List;

import task5.course.Course;


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
        if(registeredCourses.contains(course)){
            System.out.printf("Already registered for this course %n");
            return;
        }

        course.incrementNumberOfRegisteredStudents();
        registeredCourses.add(course);
        System.out.printf("Registered %n");
    }

    public boolean removeFromRegisteredCourses(String courseCode){
        return registeredCourses.removeIf(course -> course.getCode().equals(courseCode) );
    }
}
