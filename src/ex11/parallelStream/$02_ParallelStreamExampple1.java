package ex11.parallelStream;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class $02_ParallelStreamExampple1 {



    static List<String> sequentialPrintStudenTActivities(){
        long startTime = System.currentTimeMillis();
        List<String> stdActivities = StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        return stdActivities;
    }

    static List<String> parallaPrintStudenTActivities(){
        long startTime = System.currentTimeMillis();
        List<String> stdActivities = StudentDatabase.getAllStudentDetails().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        return stdActivities;
    }


    public static void main(String[] args) {
        sequentialPrintStudenTActivities(); //OP: 589
        parallaPrintStudenTActivities();    //OP: 65

    }
}
