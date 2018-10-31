package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class $07_StreamGroupingByExampleTwoArgument {
    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        return studentMap;
    }

    public static Map<Integer, Integer> twoLevelGrouping_2(){
        Map<Integer, Integer> studentInt = StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));
        return studentInt;
    }

    public static void main(String[] args) {

        System.out.println(twoLevelGrouping_1());
        //OP:
        /*
        {2={AVERAGE=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11}],
            OUTSTANDING=[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12}]},
        3={OUTSTANDING=[Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
                        Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9}]},
        4={AVERAGE=[Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}],
         OUTSTANDING=[Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}]}}

         */

        System.out.println(twoLevelGrouping_2());
        //OP: {2=23, 3=19, 4=29}
    }
}
