package task5.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseServiceImpl extends CourseService{

    List<Course> courseList = new ArrayList<>(CourseLoader.load());

    @Override
    public String addCourse(Course course) {
        courseList.add(course);
        return "course added";
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }

    @Override
    public List<Course> getAllCoursesWithSpace() {
        return courseList.stream()
                         .filter(course -> course.getNumberOfRegisteredStudents() != course.getCapacity())
                         .toList();
    }

    @Override
    public Optional<Course> getCourseById(long courseId) {
        return courseList.stream()
                         .filter(course -> course.getId() == courseId)
                         .findFirst();
    }

    @Override
    public Optional<Course> getCourseByCourseCode(String courseCode) {
        return courseList.stream()
                         .filter(course -> course.getCode().equals(courseCode))
                         .findFirst();
    }

    @Override
    public String updateCourse(long courseId, Course updatedCourse) {
        boolean courseExist = false;

        for(Course course: courseList){
            if(course.getId() == courseId){
                courseExist = true;

                course.setCapacity(updatedCourse.getCapacity());
                course.setCode(updatedCourse.getCode());
                course.setTitle(updatedCourse.getTitle());
                course.setSlot(updatedCourse.getSlot());
                course.setNumberOfRegisteredStudents(updatedCourse.getNumberOfRegisteredStudents());

                break;
            }
        }

        return courseExist? "course updated" : "course not found";
    }

    @Override
    public String deleteCourse(Course course) {
        boolean isDeleted = courseList.remove(course);
        return isDeleted? "course deleted" : "course not found";
    }
}
