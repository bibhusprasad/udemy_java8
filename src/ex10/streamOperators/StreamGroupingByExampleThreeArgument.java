package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupingByExampleThreeArgument {

    public static HashMap<String, Set<Student>> threeArgument_1(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getName, HashMap::new, Collectors.toSet()));
    }

    public static void main(String[] args) {

        System.out.println(threeArgument_1());
        //OP:
        /*
        {Adam=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11}],
        Emily=[Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10}],
         James=[Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}],
         Dave=[Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9}],
         Jenny=[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12}],
         Sophia=[Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}]}

         */
    }
}
