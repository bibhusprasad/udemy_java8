package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String joiningOne(){
        return StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joiningTwo(){
        return StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningThree(){
        return StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {

        System.out.println("Joining one : "+ joiningOne());
        //OP: AdamJennyEmilyDaveSophiaJames
        System.out.println("Joining two : "+ joiningTwo());
        //OP: Adam-Jenny-Emily-Dave-Sophia-James
        System.out.println("Joining three : "+ joiningThree());
        //OP: Joining three : (Adam-Jenny-Emily-Dave-Sophia-James)
    }
}
