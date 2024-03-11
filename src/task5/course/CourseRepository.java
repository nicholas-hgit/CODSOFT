package task5.course;

import java.util.List;
import java.util.Optional;

interface CourseRepository {
    String addCourse(Course course);
    List<Course> getAllCourses();
    List<Course> getAllCoursesWithSpace();
    Optional<Course> getCourseById(long courseId);
    Optional<Course> getCourseByCourseCode(String courseCode);
    String updateCourse(long courseId, Course updatedCourse);
    String deleteCourse(Course course);
}
