package ex06.streams;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class $03_StreamExampleDebug {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate1 = student -> student.getGpa() >= 3.8;
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;

        System.out.println("---Student name and there activities where gpa is more than 3.8---");
        Map<String, List<String>> stdMapGpaFilter = StudentDatabase.getAllStudentDetails().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .peek(student -> {
                    System.out.println("After 1st filter : "+student);
                })
                .filter(studentPredicate1)
                .peek(student -> {
                    System.out.println("After 2nd filter : "+student);
                })
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
