package ex07.streamOperations;

import ex00.studentdata.StudentDatabase;

public class StreamMatchExample {

    public static boolean allMatch(){
        return StudentDatabase.getAllStudentDetails().stream()
                .allMatch(student -> student.getGpa() > 3.9);
    }

    public static boolean anyMatch(){
        return StudentDatabase.getAllStudentDetails().stream()
                .anyMatch(student -> student.getGpa() > 3.9);
    }

    public static boolean noneMatch(){
        return StudentDatabase.getAllStudentDetails().stream()
                .noneMatch(student -> student.getGpa() > 8.9);
    }

    public static void main(String[] args) {
        System.out.println(allMatch()); //OP: false only 2 student have more than 3.9 not all
        System.out.println(anyMatch()); //OP: true only 2 student have more than 3.9 i.e. any one match
        System.out.println(noneMatch()); //OP: true non of the student have more than 3.9 i.e. no match
    }
}
