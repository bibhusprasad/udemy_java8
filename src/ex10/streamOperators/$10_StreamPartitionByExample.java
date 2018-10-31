package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class $10_StreamPartitionByExample {

    public static Map<Boolean, List<Student>> partitionBy_1(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8));
    }

    public static Map<Boolean, Set<Student>> partitionBy_2(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8, Collectors.toSet()));
    }

    public static void main(String[] args) {
        System.out.println(partitionBy_1());
        //OP:
        /*
        {false=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11},
             Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}],
        true=[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12},
             Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
             Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9},
             Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}]}
         */
        System.out.println(partitionBy_2());
        //OP:
        /*
        {false=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11},
             Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}],
        true=[Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
               Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14},
               Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9},
               Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12}]}

         */
    }
}
