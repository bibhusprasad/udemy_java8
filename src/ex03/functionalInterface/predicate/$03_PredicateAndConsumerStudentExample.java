package ex03.functionalInterface.predicate;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class $03_PredicateAndConsumerStudentExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.8;

    BiConsumer<String, List<String>> biConsumer = (s, strings) -> System.out.println("name : "+ s +" - activity :"+ strings);

    Consumer<Student> consumer = student -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> stdList){
        stdList.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        new $03_PredicateAndConsumerStudentExample().printNameAndActivities(stdList);

        //OP:
        /*
        name : Emily - activity :[swimming, gymnastics, aerobics]
        name : Dave - activity :[swimming, gymnastics, soccer]
        name : James - activity :[swimming, basketball, baseball]
         */
    }
}
