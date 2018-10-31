package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Optional;

public class $12_StreamFindAnyFindFirstExample {

    public static Optional<Student> findAny(){
        return StudentDatabase.getAllStudentDetails().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }


    public static Optional<Student> findFirst(){
        return StudentDatabase.getAllStudentDetails().stream()
                .findFirst();
    }


    public static void main(String[] args) {
        System.out.println(findAny().get());
        //OP: Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10}
        System.out.println(findFirst().get());
        //OP: Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11}
    }
}
