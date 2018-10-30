package ex04.references;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = student -> System.out.println(student);
    static Consumer<Student> c2 = System.out::println;

    static Consumer<Student> c3 = student -> student.printListOfActivities();
    static Consumer<Student> c4 = Student::printListOfActivities;

    public static void main(String[] args) {
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(c1);
        System.out.println("------");
        stdList.forEach(c2);
        System.out.println("------");
        stdList.forEach(c3);
        System.out.println("------");
        stdList.forEach(c4);

        //OP:
        /*
        Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]}
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
        ------
        Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]}
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
        ------
        [swimming, basketball, volleyball]
        [swimming, gymnastics, soccer]
        [swimming, gymnastics, aerobics]
        [swimming, gymnastics, soccer]
        [swimming, dancing, football]
        [swimming, basketball, baseball]
        ------
        [swimming, basketball, volleyball]
        [swimming, gymnastics, soccer]
        [swimming, gymnastics, aerobics]
        [swimming, gymnastics, soccer]
        [swimming, dancing, football]
        [swimming, basketball, baseball]
         */
    }
}
