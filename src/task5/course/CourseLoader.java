package task5.course;

import java.util.List;

class CourseLoader {

    private static final List<Course> courseList = List.of(
            new Course(
                    202,
                    "Introduction to Algorithms and Programming",
                    "IAP3002A",
                    "C",
                    1
            ),

            new Course(
                    200,
                    "Basic Computer Organisation",
                    "BCO3001",
                    "C",
                    100
            ),

            new Course(
                    305,
                    "Multivariable calculus",
                    "MATH2002A",
                    "A",
                    200
            ),

            new Course(
                    204,
                    "Optimisation",
                    "APPM3002A",
                    "C",
                    100
            ),

            new Course(
                    203,
                    "Numerics",
                    "APPM3001A",
                    "C",
                    100
            ),

            new Course(
                    403,
                    "Modelling",
                    "APPM3003A",
                    "C",
                    100
            )
    );

    public static List<Course> load(){
        return courseList;
    }
}
