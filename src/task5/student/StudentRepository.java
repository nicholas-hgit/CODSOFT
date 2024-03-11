package task5.student;

import java.util.List;
import java.util.Optional;

interface StudentRepository {
    String addStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(long studentId);
    String updateStudent(long studentId, Student updatedStudent);
    String deleteStudent(Student student);
}
