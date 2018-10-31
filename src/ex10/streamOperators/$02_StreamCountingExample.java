package ex10.streamOperators;

import ex00.studentdata.StudentDatabase;

import java.util.stream.Collectors;

public class $02_StreamCountingExample {

    public static long count(){
        return StudentDatabase.getAllStudentDetails().stream()
                .filter(std -> std.getGpa()>3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());//OP: 1
    }
}
