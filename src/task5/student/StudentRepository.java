package task5.student;

import java.util.List;

public interface StudentRepository {
    String addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long studentId);
    String updateStudent(long studentId, Student updatedStudent);
    String deleteStudent(Student student);
}
