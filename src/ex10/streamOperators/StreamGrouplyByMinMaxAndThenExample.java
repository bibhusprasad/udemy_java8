package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamGrouplyByMinMaxAndThenExample {

    public static Map<Integer, Optional<Student>> calculateToGpa(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel ,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    public static Map<Integer, Student> calculateToGpa_1(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel ,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    public static void main(String[] args) {
        System.out.println(calculateToGpa());
        //OP:
        /*
        {2=Optional[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12}],
         3=Optional[Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10}],
          4=Optional[Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}]}
         */
        System.out.println(calculateToGpa_1());
        //OP:
        /*
        {2=Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12},
        3=Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
        4=Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}}

         */
    }
}
