package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class $05_StreamFilterExample {

    public static List<Student> filterStudents(){
        return StudentDatabase.getAllStudentDetails().stream()
                .filter(student ->  student.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
        //OP:
        /*
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
         */
    }
}
