package task5;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import task5.course.Course;
import task5.course.CourseController;
import task5.course.CourseServiceImpl;
import task5.student.Student;
import task5.student.StudentController;
import task5.student.StudentServiceImpl;

@SuppressWarnings("InfiniteLoopStatement")
public class StudentSelfService {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AtomicLong studentIdGenerator = new AtomicLong(10260);
        StudentController studentController = new StudentController(new StudentServiceImpl());
        CourseController courseController = new CourseController(new CourseServiceImpl());

        do {

            displayHomeMenu();
            int selectedOption = input.nextInt();
            input.nextLine();

            if(selectedOption == 1){

                System.out.println("***** Register student profile *****");

                System.out.println("Enter first name");
                String firstName = input.nextLine();

                System.out.println("Enter last name");
                String lastName = input.nextLine();

                Student student = new Student(firstName,lastName,studentIdGenerator.addAndGet(15));
                studentController.addStudent(student);

                System.out.printf("profile created your student id is %d %n",student.getStudentId());
            }
            else {

                System.out.println("Enter student id");
                long studentId = input.nextLong();
                input.nextLine();

                Student student = studentController.getStudentById(studentId);
                if (student == null) {
                    System.out.println("invalid student id");
                    continue;
                }

                boolean goBack = false;
                do {

                    displayOptions();
                    selectedOption = input.nextInt();

                    switch (selectedOption){
                        case  1 ->  {

                            List<Course> registeredCourses = student.getRegisteredCourses();
                            if(registeredCourses.isEmpty()){
                                System.out.println("You have no registered course");
                            }
                            else {
                                registeredCourses.forEach(System.out::println);
                            }
                        }

                        case  2 -> {

                            System.out.println("Available courses");

                            List<Course> availableCourses = courseController.getAllCoursesWithSpace();
                            if(availableCourses.isEmpty()){
                                System.out.println("There are no available courses");
                                continue;
                            }

                            availableCourses.forEach(System.out::println);

                            System.out.println("Enter course id");
                            long courseId = input.nextLong();
                            input.nextLine();

                            Course course = courseController.getCourseById(courseId);

                            if(course == null){
                                System.out.println("invalid course id");
                            }
                            else{
                                student.addToRegisteredCourses(course);
                            }
                        }

                        case  3 -> {
                            System.out.println("Enter course id");
                            long courseId = input.nextLong();
                            input.nextLine();

                            boolean isRemoved = student.removeFromRegisteredCourses(courseId);
                            if(isRemoved) {
                                System.out.printf("You have dropped course with id %s %n",courseId);
                            }
                            else{
                                System.out.println("Invalid course id");
                            }

                        }

                        default -> goBack = true;
                    }

                } while (!goBack);
            }



        }while (true);
    }

    public static void displayHomeMenu() {
        String menu = """
                ========== student self-service ==========
                1. New Student
                2. Existing student
                """;

        System.out.println(menu);
    }

    public static  void displayOptions() {
        String options = """
                1. View registered courses
                2. Register new course
                3. Drop course
                4. Back
                """;

        System.out.println(options);
    }
}
