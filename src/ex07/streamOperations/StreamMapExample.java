package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    static List<String> namesList(){
        return StudentDatabase.getAllStudentDetails().stream() //op is Stream<Student>
                //Student as an input and get Student name as output
                .map(Student::getName) //Stream<Stringt>
                .collect(Collectors.toList());
    }

    static Set<String> namesSetToUpperCase(){
        return StudentDatabase.getAllStudentDetails().stream() //op is Stream<Student>
                //Student as an input and get Student name as output
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String>
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(namesList()); //OP: [Adam, Jenny, Emily, Dave, Sophia, James]
        System.out.println(namesSetToUpperCase()); //OP: [ADAM, DAVE, JAMES, SOPHIA, JENNY, EMILY]
    }
}
