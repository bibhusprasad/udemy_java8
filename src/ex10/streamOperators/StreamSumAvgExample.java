package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.stream.Collectors;

public class StreamSumAvgExample {

    public static int sum(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }
    public static double avg(){
        return StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Total : "+ sum());
        System.out.println("Avg : "+ avg());
        //OP:
        /*
        Total : 71
        Avg : 11.833333333333334
         */
    }
}
