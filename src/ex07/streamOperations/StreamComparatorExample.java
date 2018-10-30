package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    static Comparator<Student> c = Comparator.comparing(Student::getName);

    public static List<Student> sortStdByName(){
        return StudentDatabase.getAllStudentDetails().stream()
                .sorted(c)
                .collect(Collectors.toList());
    }

    public static List<Student> sortStdByGpa(){
        return StudentDatabase.getAllStudentDetails().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("---Student sorted by name.");
        sortStdByName().forEach(System.out::println);
        //OP:
        /*
        Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
         */

        System.out.println("---Student sorted by gpa.");
        sortStdByGpa().forEach(System.out::println);

        //OP:
        /*
        ---Student sorted by gpa.
        Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}
        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer]}
        Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball]}
        Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer]}
        Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball]}
        Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football]}
         */
    }
}
