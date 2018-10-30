package ex03.functionalInterface.predicate;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    public static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    public static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void filterStudentByGrade(){
        System.out.println("------filter by grade level-----");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa(){
        System.out.println("------filter by gpa level-----");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGradeAndGpa(){
        System.out.println("------filter by grade and gpa level-----");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(student -> {
            if(p1.and(p2.negate()).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGrade();
        //OP:
        /*
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
         */
        filterStudentByGpa();
        //OP:
        /*
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
         */
        filterStudentByGradeAndGpa();
        //OP:
        /*
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
         */
    }
}
