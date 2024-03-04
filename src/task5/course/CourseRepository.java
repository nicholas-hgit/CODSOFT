package task5.course;

import java.util.List;

public interface CourseRepository {
    String addCourse(Course course);
    List<Course> getAllCourses();
    List<Course> getAllCoursesWithSpace();
    Course getCourseById(long courseId);
    Course getCourseByCourseCode(String courseCode);
    String updateCourse(long courseId, Course updatedCourse);
    String deleteCourse(Course course);
}
