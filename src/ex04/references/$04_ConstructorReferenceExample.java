package ex04.references;

import ex00.studentdata.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class $04_ConstructorReferenceExample {

    static Supplier<Student> supplier = Student::new;

    static Function<String, Student> function = Student::new;

    public static void main(String[] args) {
        System.out.println(supplier.get());
        //OP: Student{name='null', gradeLevel=0, gpa=0.0, gender='null', activities=null}

        System.out.println(function.apply("Bibhu"));
        //OP: Student{name='Bibhu', gradeLevel=0, gpa=0.0, gender='null', activities=null}

    }
}
