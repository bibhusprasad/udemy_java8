package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $06_StreamReduceExample {

    public static Optional<Double> getTotalGpa(){
        return StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getGpa)
                .reduce((student1, student2) -> student1 + student2);
    }

    public static int performMultipication(List<Integer> integerList){
        return integerList.stream()
                //a=1(identity) b=1 from stream => result is 1
                //a=1(from result) b=3 from stream => result is 3
                //a=3(from result) b=5 from stream => result is 15
                //a=15(from result) b=7 from stream => result is 105
                .reduce(1, (a, b) -> a*b);
    }

    public static Optional<Integer> performMultipicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                //a=1(identity) b=1 from stream => result is 1
                //a=1(from result) b=3 from stream => result is 3
                //a=3(from result) b=5 from stream => result is 15
                //a=15(from result) b=7 from stream => result is 105
                .reduce((a, b) -> a*b);
    }

    public static void main(String[] args) {

        System.out.println(getTotalGpa()); //OP: Optional[22.7]
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        List<Integer> emptyIntegerList = Arrays.asList();

        System.out.println(performMultipication(integerList)); //OP: 105

        System.out.println(performMultipicationWithoutIdentity(integerList)); //OP: Optional[105]
        System.out.println(performMultipicationWithoutIdentity(integerList).get()); //OP: 105
        System.out.println(performMultipicationWithoutIdentity(integerList).isPresent()); //OP: true

        System.out.println(performMultipicationWithoutIdentity(emptyIntegerList)); //OP: Optional.empty
        System.out.println(performMultipicationWithoutIdentity(emptyIntegerList).isPresent()); //OP: false
        //System.out.println(performMultipicationWithoutIdentity(emptyIntegerList).get());
        /*
        Exception in thread "main" java.util.NoSuchElementException: No value present
        at java.util.Optional.get(Optional.java:135)
        at ex07.streamOperations.$06_StreamReduceExample.main($06_StreamReduceExample.java:50)
         */
        if(performMultipicationWithoutIdentity(emptyIntegerList).isPresent()){
            System.out.println(performMultipicationWithoutIdentity(emptyIntegerList).get());
        }
    }
}
