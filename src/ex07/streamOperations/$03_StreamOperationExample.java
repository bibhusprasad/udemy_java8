package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class $03_StreamOperationExample {

    static List<String> printListActivities(){
        return StudentDatabase.getAllStudentDetails().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Filter unique result //Stream<String>
                .collect(Collectors.toList());

    }

    static long getStudentActivitiesCount(){
        return StudentDatabase.getAllStudentDetails().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();

    }

    static List<String> getStudentActivitiesSortedOrder(){
        return StudentDatabase.getAllStudentDetails().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
               // .sorted()  //Natural sorting order
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(printListActivities());
        //OP: [swimming, basketball, volleyball, gymnastics, soccer, aerobics, dancing, football, baseball]
        System.out.println(getStudentActivitiesCount());
        //OP: 9
        System.out.println(getStudentActivitiesSortedOrder());
        //OP: [volleyball, swimming, soccer, gymnastics, football, dancing, basketball, baseball, aerobics]
    }
}
