package ex03.functionalInterface.supplier;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Double> supplier = () -> Math.random();
    static Supplier<List<Student>> stdList = () -> StudentDatabase.getAllStudentDetails();


    public static void main(String[] args) {
        System.out.println(supplier.get());
        //OP: 0.986943902859048

        System.out.println(stdList.get());
        //OP:
        /*
        [Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]},
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]},
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]},
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]},
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]},
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}]
         */
    }
}
