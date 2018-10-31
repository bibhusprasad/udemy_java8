package ex10.streamOperators;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class $03_StreamMappingExample {
    public static void main(String[] args) {
        List<String> names = StudentDatabase.getAllStudentDetails().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(names);
        //OP: [Adam, Jenny, Emily, Dave, Sophia, James]
        List<String> stdNames = Arrays.asList("a", "b", "a", "b");
        Set<String> nameSet = stdNames.stream()
                .collect(Collectors.toSet());
        System.out.println(nameSet);
        //OP: [a, b]
    }
}
