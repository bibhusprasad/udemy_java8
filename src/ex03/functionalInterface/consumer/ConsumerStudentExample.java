package ex03.functionalInterface.consumer;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerStudentExample {

    static Consumer<Student> c1 = student -> System.out.println(student);
    static Consumer<Student> c2 = student -> System.out.print(student.getName());
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());

    static void printName(){
        System.out.println("------print all student------");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(c1);
    }
    //OP:
    /*
    ------print all student------
    Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]}
    Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
    Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
     */

    static void printNameAndActivity(){
        System.out.println("------print student name with activity------");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(c2.andThen(c3));
    }
    //OP:
    /*
    ------print student name with activity------
    Adam[swimming, basketball, volleyball]
    Jenny[swimming, gymnastics, soccer]
    Emily[swimming, gymnastics, aerobics]
    Dave[swimming, gymnastics, soccer]
    Sophia[swimming, dancing, football]
    James[swimming, basketball, baseball]
     */

    static void printNameAndActivityUsingCondition(){
        System.out.println("------print student name with activity using condition------");
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(student -> {
            if(student.getGradeLevel() >= 3){
                c2.andThen(c3).accept(student);
            }
        });
    }
    //OP:
    /*
    ------print student name with activity using condition------
    Emily[swimming, gymnastics, aerobics]
    Dave[swimming, gymnastics, soccer]
    Sophia[swimming, dancing, football]
    James[swimming, basketball, baseball]
     */

    public static void main(String[] args) {
        printName();
        printNameAndActivity();
        printNameAndActivityUsingCondition();
    }
}
