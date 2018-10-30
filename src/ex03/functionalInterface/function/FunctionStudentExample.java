package ex03.functionalInterface.function;

import ex03.functionalInterface.predicate.PredicateStudentExample;
import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> function = students -> {
        Map<String, Double> stdGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.p2.test(student)){
                stdGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return stdGradeMap;
    };

    static void printAllStudentDetails(List<Student> stdList){
        System.out.println(function.apply(stdList));
    }

    public static void main(String[] args) {
        printAllStudentDetails(StudentDatabase.getAllStudentDetails());
        //OP: {Emily=4.0, James=3.9, Dave=3.9}
    }
}
