package ex04.references;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.function.Predicate;

public class $03_RefactorMethodReferenceExample {

    static Predicate<Student> p = $03_RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel() > 3;
    }

    public static void main(String[] args) {
        System.out.println(p.test(StudentDatabase.stdSupplier.get())); //OP: false
    }
}
