package task5.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentServiceImpl extends StudentService{

    List<Student> studentList = new ArrayList<>();

    @Override
    public String addStudent(Student student) {
        studentList.add(student);
        return "Student added successfully";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public Optional<Student> getStudentById(long studentId) {
        return studentList.stream()
                          .filter(student -> student.getStudentId()  == studentId)
                          .findFirst();
    }

    @Override
    public String updateStudent(long studentId, Student updatedStudent) {

        boolean studentExist = false;
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                studentExist = true;

                student.setFirstName(updatedStudent.getFirstName());
                student.setLastName(updatedStudent.getLastName());
                student.setRegisteredCourses(updatedStudent.getRegisteredCourses());

                break;
            }

        }

        return studentExist? "student updated" : "student not found";

    }

    @Override
    public String deleteStudent(Student student) {
       boolean isDeleted = studentList.remove(student);
       return isDeleted? "student deleted" : "student not found";
    }
}
