package task5.student;

import java.util.List;
import java.util.Optional;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    public String addStudent(Student student){
        return studentService.addStudent(student);
    }

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    public Optional<Student> getStudentById(long studentId){
        return studentService.getStudentById(studentId);
    }

    public String updateStudent(long studentId, Student updatedStudent){
        return studentService.updateStudent(studentId,updatedStudent);
    }

    public String deleteStudent(Student student){
        return studentService.deleteStudent(student);
    }
}
