package ex06.streams;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class $02_StreamExample {

    public static void main(String[] args) {

        System.out.println("---Student name and there activities---");
        Map<String, List<String>> stdMap = StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stdMap);
        //OP:
        /*
        ---Student name and there activities---
        {Adam=[swimming, basketball, volleyball],
        Emily=[swimming, gymnastics, aerobics],
        James=[swimming, basketball, baseball],
        Dave=[swimming, gymnastics, soccer],
        Jenny=[swimming, gymnastics, soccer],
        Sophia=[swimming, dancing, football]}
         */

        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        System.out.println("---Student name and there activities where gradeLevel is more than 3---");
        Map<String, List<String>> stdMapGradeFilter = StudentDatabase.getAllStudentDetails().stream()
                .filter(studentPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stdMapGradeFilter);
        //OP:
        /*
        ---Student name and there activities where gradeLevel is more than 3---
        {Emily=[swimming, gymnastics, aerobics],
        James=[swimming, basketball, baseball],
        Dave=[swimming, gymnastics, soccer],
        Sophia=[swimming, dancing, football]}
         */

        Predicate<Student> studentPredicate1 = student -> student.getGpa() >= 3.8;
        System.out.println("---Student name and there activities where gpa is more than 3.8---");
        Map<String, List<String>> stdMapGpaFilter = StudentDatabase.getAllStudentDetails().stream()
                .filter(studentPredicate)
                .filter(studentPredicate1)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stdMapGpaFilter);
        //OP
        /*
        ---Student name and there activities where gpa is more than 3.8---
        {Emily=[swimming, gymnastics, aerobics],
        James=[swimming, basketball, baseball],
        Dave=[swimming, gymnastics, soccer]}
         */
    }
}
