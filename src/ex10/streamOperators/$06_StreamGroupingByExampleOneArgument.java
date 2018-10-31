package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class $06_StreamGroupingByExampleOneArgument {


    public static Map<String, List<Student>> groupByGender(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customizeGroupByGpa(){
         return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.groupingBy(std -> std.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static void main(String[] args) {
        System.out.println(groupByGender());
        //OP:
        /*
        {female=[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12},
                Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
                Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}],
        male=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11},
            Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9},
            Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}]}
         */
        System.out.println(customizeGroupByGpa());
        //OP:
        /*
        {AVERAGE=[Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11},
                 Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15}],
        OUTSTANDING=[Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12},
            Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10},
            Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9},
            Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14}]}
         */
    }
}
