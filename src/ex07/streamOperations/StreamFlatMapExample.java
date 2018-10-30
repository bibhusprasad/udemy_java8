package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    static List<String> printListActivities(){
        return StudentDatabase.getAllStudentDetails().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(printListActivities());
        //OP: [swimming, basketball, volleyball, swimming, gymnastics, soccer, swimming, gymnastics, aerobics, swimming, gymnastics, soccer, swimming, dancing, football, swimming, basketball, baseball]
    }
}
