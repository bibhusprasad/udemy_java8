package ex03.functionalInterface.function;

import ex03.functionalInterface.predicate.$02_PredicateStudentExample;
import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class $03_BiFunctionExample {

    public static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate) -> {
        Map<String, Double> stdGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)){
                stdGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return stdGradeMap;
    };

    public static void main(String[] args) {
        System.out.println( biFunction.apply(StudentDatabase.getAllStudentDetails(), $02_PredicateStudentExample.p2));
        //OP: {Emily=4.0, James=3.9, Dave=3.9}
    }
}
