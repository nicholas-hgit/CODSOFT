package task5.course;

import java.util.List;

public class CourseController {

    private final  CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    public String addCourse(Course course){
        return courseService.addCourse(course);
    }

    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    public List<Course> getAllCoursesWithSpace(){
        return courseService.getAllCoursesWithSpace();
    }

    public Course getCourseById(long courseId){
        return  courseService.getCourseById(courseId);
    }

    public String updateCourse(long courseId, Course updatedCourse){
        return courseService.updateCourse(courseId,updatedCourse);
    }

    public String deleteCourse(Course course){
        return courseService.deleteCourse(course);
    }
}
